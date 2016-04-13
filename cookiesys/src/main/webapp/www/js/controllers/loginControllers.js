/**
 * Created by Administrator on 2015/11/30.
 */

(function() {
    appModule
        .controller('loginController', LoginControllerFun) // 登录控制器
        .controller('menuController', MenuControllerFun)
        .factory('loginService', loginServiceFun);

    /**
     * 登录控制器
     */
    function LoginControllerFun($scope,　$state ,loginService) {
        $scope.loginData ={}; //登录数据
        $scope.login = loginFun; //登录

        //登录
        function loginFun() {
            loginService.login($scope.loginData).then(function(result) {
                if(result.id){
                    $state.go('menu');
                }
            }).catch(function(error) {

            }).finally(function () {

            });
        }

    }

    function MenuControllerFun($scope, $mdSidenav){
        $scope.openLeftMenu = function() {
            $mdSidenav('left').toggle();
        };
    }

    /**
     * 登录服务
     */
    function loginServiceFun($q,$http,appConfig) {
        return {
            login: loginFun,
            signup: signupFun
        };

        /**
         * 登录
         */
        function loginFun(data) {
            var delay = $q.defer();
            $http.post(appConfig.getHost() + 'login_check', data).success(function (data) {
                delay.resolve(data);
            }).error(function (error) {
                console.log(error);
                delay.reject('服务器连接失败。');
            });
            return delay.promise;
        }

        /**
         * 注册
         */
        function signupFun(data) {
            var checkFlag = checkSignData(data);
            if (checkFlag === true) {
                return commonHttp.jsonPost('signup.json', data);
            } else {
                var delay = $q.defer();
                delay.reject(checkFlag);
                return delay.promise;
            }
        }

        //校验注册数据
        function checkSignData(signData) {
            if (!signData.username) {
                return '请输入用户名。';
            }
            if (signData.username.length < 3) {
                return '至少输入三个字符。';
            }
            if (!tools.checkEmail(signData.email)) {
                return '请输入正确的电子邮件。';
            }
            if (!signData.password || signData.password.length < 6) {
                return '至少输入六位密码。';
            }
            if (!signData.checkpwd || signData.password !== signData.checkpwd) {
                return '两次输入的密码不一致';
            }
            return true;
        }
    }

})();
