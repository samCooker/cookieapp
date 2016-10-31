/**
 *
 */

// 设置全局变量 appModule，
var appModule = angular.module('starter', ['ui.router','ngMaterial']);

appModule
    .run(function (dbTool) {
    //初始化本地存储数据库
    dbTool.initWebSqlDb('appDb');
    })
    .factory('appConfig', function () {
        var host = 'localhost';
        var port = '28080';

        return {
            getHost: getHostFun//获取http请求url
        };

        /**
         * 获取http请求url
         * @returns {string}
         */
        function getHostFun() {
            return 'http://' + host + ':' + port + '/cookiesys/';
        }

    })
;