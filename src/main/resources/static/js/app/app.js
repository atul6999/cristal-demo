'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers', 'demo.services' ]);
demoApp.constant("CONSTANTS", {
	getUserByIdUrl : "/user/getUser/",
	getAllUsers : "/user/getAllUsers",
	saveUser : "/user/saveUser"
});

/*var module = angular.module('demo.controllers', []);
module.controller( 'helloController',['$scope', 'myconfig',
    function($scope, myconfig){
        $scope.appName= "Atul angular app";
        $scope.appName= myconfig.applicationName;
        $scope.dateAng = Date();
    }
]);
module.constant('myconfig', {applicationName: 'Atul'});*/