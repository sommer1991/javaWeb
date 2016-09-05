angular.module('service', ['ngResource'])
.factory('UserService',['$resource', function($resource){
    return $resource("",{},{});
}]);
