'use strict';


var app = angular.module('app', [
'ngRoute',
'ngResource',
]);

app.config(['$routeProvider',function ($routeProvider) {
	$routeProvider.when('/signin',{
		templateUrl:'commonviews/signin.html',
		controller:'signinCtrl'
	})
	.when('/signup',{
		templateUrl:'commonviews/signup.html',
		controller:'signupCtrl'
	})
	.when('/home',{
		templateUrl:'dashboard/home.html',
		controller:'homeCtrl'
	})
	.otherwise({redirectTo:'/signin'
	});
	
}]);

app.run(['$rootScope','$resource',function($rootScope,$resource){
	 $rootScope.user={};
}]);