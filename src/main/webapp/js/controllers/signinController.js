app.controller('signinCtrl', ['$rootScope', '$scope', '$resource','$location', function($rootScope, $scope, $resource, $location) {
    $scope.user = $rootScope.user;
    $scope.authError = null;
    $scope.login = function() {
    	var userResource = $resource('user/login', {}, {login:{method:'POST'}});
    	userResource.login({},$scope.user, function (res) {
    		if(res.data==true){
    			setCookie("username", $scope.user.name,1);
    			$location.path("/home");
    		}else{
    			$scope.authError = "Authentication faliure";
    		}
    	}, function (res) {
        	$scope.authError = "Server error";
        });
    };
  }]);