'use strict';


var app = angular.module('app', [

]);

app.config(['routeProvider', function($routeProvider){
	$routeProvider.when('signin',{
		templateUrl:'dashboard/signin.html',
		controller:'signinCtrl'
	})
	$routeProvider.when('signup',{
		templateUrl:'dashboard/signup.html',
		controller:'signupCtrl'
	})
	.when('author',{
		templateUrl:'dashboard/author.html',
		controller:'authorCtrl'
	})
	.when('blog',{
		templateUrl:'dashboard/blog.html',
		controller:'blogCtrl'
	})
	.otherwise({redirectTo:'/home'
	});
	
}]);

app.run(['$rootScope',function($rootScope){
	
}]);