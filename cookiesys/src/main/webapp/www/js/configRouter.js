/**
 * Created by cookie on 2016/4/10.
 *
 */

appModule.config(function($stateProvider, $urlRouterProvider){

$stateProvider
    //登录
    .state('login',{
        url:'/login',
        views:{
            'mainView':{
                controller:'loginController',
                templateUrl:'www/templates/login.html'
            }
        }
    })
    .state('menu',{
        url:'/menu',
        views:{
            'mainView':{
                controller:'menuController',
                templateUrl:'www/templates/menu.html'
            }
        }
    })

    //普通用户登录
    .state('home',{//状态名称
        url: '/home',//页面跳转url,跳转方式有：1.$state.go(stateName) 2. 点击包含 ui-sref 指令的链接 <a ui-sref=stateName>Go State</a> 或 href=url的链接
        abstract: true,//表明此状态不能被显性激活，只能被子状态隐性激活
        controller: 'homeController',//控制器名称
        templateUrl: 'www/templates/home/menu-common.html'//html模版路径，也可以直接使用template:'<div>template...<div>'
    })
    .state('home.welcome',{
        url:'/welcome',
        views:{
            'welcome':{
                templateUrl:'www/templates/home/welcome.html',
                controller:'welcomeController'
            }
        }
    })
    .state('admin.management',{
        url:'/management',
        views:{
            'management':{
                templateUrl:'www/templates/home/management.html',
                controller:'userManagementController'
            }
        }
    })
    ;
    $urlRouterProvider.otherwise('/login');//找不到对应url的默认设置
});