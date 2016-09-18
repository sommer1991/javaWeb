app.controller('signinCtrl', ['$scope', '$resource','$location','$cookieStore', function($scope, $resource, $location,$cookieStore) {
    $scope.user = {};
    $scope.authError = null;
    $scope.login = function() {
    	var userResource = $resource('user/login', {}, {login:{method:'POST'}});
    	userResource.login({},$scope.user, function (res) {
    		$scope.user = res.data;
    		if(res.data==1){
    			$cookieStore.put("user", $scope.user);
    			$location.path("/home");
    		}else{
    			$scope.authError = "Authentication faliure";
    		}
    	}, function (res) {
        	$scope.authError = "Server error";
        });
    };
  }])
;