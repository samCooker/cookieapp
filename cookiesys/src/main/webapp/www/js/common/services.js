/**
 * Created by Administrator on 2015/11/30.
 */

(function() {
    appModule
        .factory('dbTool', DbToolFun) //本地存储
    ;
    /**
     * 本地存储
     * @param tipMsg
     * @returns {*}
     * @constructor
     */
    function DbToolFun() {
        var Fac = {
            initWebSqlDb: initWebSqlDbFun,
            putFdData: putFdDataFun,
            getWorklogUser:getWorklogUserFun,
            putWorklogUser:putWorklogUserFun,
            putWorklogData: putWorklogDataFun,
            getWorklogData:getWorklogDataFun,
            postOrUpdate: postOrUpdateFun,
            findFdData: findFdDataFun,
            getAllFdData: getAllFdDataFun,
            rmFdData: removeFdDataFun,
            getAllDocs: getAllDocsFun,
            getDb: getDbFun
        };

        var _db;
        var _fdId = 'fodoItem';
        var _worklogId = 'worklogId';
        var _worklogUserId = 'worklogUserId';

        /**
         * 创建一个本地存储数据库
         * @param dbname 数据库名称
         */
        function initWebSqlDbFun(dbname) {
            _db = new PouchDB(dbname, { adapter: 'websql' });

            _db.createIndex({
                index: {
                    fields: ['_id'],//对字段建立索引
                    name:'search-id-index'
                }
            }).catch(function (err) {
                console.log(err);
            });
        }

        /**
         * 保存数据，_id指定
         * @param data 数据对象
         * @returns {*}
         */
        function putFdDataFun(data) {
            data._id = _fdId + data.title; //指定id
            return _db.put(data).then(function(result) {
                return result;
            }).catch(function(err) {
                console.log(err);
            });
        }

        /**
         * 保存最近一次的工作日志信息数据，_id指定
         * @param data 数据对象
         * @returns {*}
         */
        function putWorklogDataFun(data) {
            findDataByIdFun(_worklogId).then(function (result) {
                if(result._id){
                    result.useHours=data.useHours;
                    result.workType=data.workType;
                    result.prjNo=data.prjNo;
                    result.prjName=data.prjName;
                    _db.put(result);
                }else{
                    data._id = _worklogId; //指定id
                    _db.put(data);
                }
            }).catch(function (error) {
            });
        }

        /**
         * 获取保存在本地的工作日志信息数据
         * @returns {*}
         */
        function getWorklogDataFun() {
            return findDataByIdFun(_worklogId,['_id','useHours', 'workType', 'prjNo', 'prjName']);
        }

        function getWorklogUserFun() {
            return findDataByIdFun(_worklogUserId,['_id','account','password']);
        }

        function putWorklogUserFun(data) {
            findDataByIdFun(_worklogUserId).then(function (result) {
                if(result._id){
                    result.account=data.account;
                    result.password=data.password;
                    _db.put(result);
                }else{
                    data._id = _worklogUserId; //指定id
                    _db.put(data);
                }
            }).catch(function (error) {
            });
        }

        /**
         * 根据_id查找doc
         * @param id
         * @param fields 指定返回的字段，若为空则返回所有
         * @returns {*}
         */
        function findDataByIdFun(id,fields) {
            var returnData={};
            return _db.find({
                selector: { _id: { $eq: id } },
                fields: fields
            }).then(function(data) {
                if (data.docs && data.docs.length > 0) {
                    data.docs.forEach(function(doc) {
                        if (doc._id==id) {
                            returnData=doc;
                        }
                    });
                }
                return returnData;
            });
        }

        /**
         * 保存一条数据，有_id则进行更新操作，否则新增
         * @param data
         * @returns {*}
         */
        function postOrUpdateFun(data) {
            if (data._id) {
                return _db.get(data._id).then(function(doc) {
                    doc.title = data.title;
                    doc.content = data.content;
                    return _db.put(doc).then(function(result) {
                        tipMsg.showMsg('修改成功。');
                        return result;
                    }).catch(function(err) {
                        tipMsg.showMsg('修改失败。');
                    });
                });
            } else {
                return _db.post(data).then(function(result) {
                    tipMsg.showMsg('保存成功。');
                    return result;
                }).catch(function(err) {
                    tipMsg.showMsg('保存失败。');
                });
            }
        }

        /**
         * 根据title查找doc
         * @param title
         * @returns {*}
         */
        function findFdDataFun(title) {
            return _db.find({
                selector: { title: { $eq: title } },
                fields: ['_id', 'title', 'content', 'img']
            }).then(function(data) {
                var itemList = [];
                if (data.docs && data.docs.length > 0) {
                    data.docs.forEach(function(doc) {
                        if (doc.title) {
                            itemList.push(doc);
                        }
                    });
                }
                return itemList;
            });
        }

        /**
         * 获取所有doc数据
         * @returns {*}
         */
        function getAllDocsFun() {
            return _db.allDocs({ include_docs: true });
        }

        /**
         * 获取所有含有title的doc
         * @returns {*}
         */
        function getAllFdDataFun() {
            var data = [];
            return _db.allDocs({ include_docs: true }).then(function(result) {
                if (result.rows && result.rows.length > 0) {
                    result.rows.forEach(function(row) {
                        if (row.doc && row.doc.title) {
                            data.push(row.doc);
                        }
                    });
                }
                return data;
            });
        }

        /**
         * 删除指定的doc
         * @param item
         */
        function removeFdDataFun(item) {
            return _db.remove(item);
        }

        /**
         * 获取创建的数据库
         * @returns _db 在应用启动时创建，见app.js
         */
        function getDbFun() {
            return _db;
        }

        return Fac;
    }
})();
