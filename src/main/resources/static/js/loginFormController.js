/**
 * Created by 王贇超 on 2017/4/5.
 */
pentaHackApp.controller('loginFormController', function($scope, $http, $cookieStore) {
    $scope.loginMessage = '';
    $scope.userLogin = function(){
        $http({
            method  : 'post',
            url     : '/login',
            params  :{
                username : $scope.username,
                password : $scope.password
            }
        }).then(function successCallback(response) {
            // 请求成功执行代码
            location.href = "/loginSuccess";
        }, function errorCallback(response) {
            // 请求失败执行代码
            $scope.loginMessage = "用户名或密码错误！";
            $scope.loginMessage = response;
            $scope.username = "";
            $scope.password = "";
        });
    }
});
