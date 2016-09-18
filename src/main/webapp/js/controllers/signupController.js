app.controller('signupCtrl',function ($rootScope,$scope,$resource,$location) {
	
	$scope.user={};
	
	$scope.validUsername=true;
	
    $scope.signup = function () {
    	
    	var userResource = $resource('user/new', {}, {add:{method:'POST',responseType:"application/json;charset=UTF-8"}});
    	userResource.save({},$scope.user, function (res) {
            alert("signup success");
            var user = res.data;
            $rootScope.user.name=$scope.user.name;
			$location.path("/signin");
        }, function (data) {
        	alert("signup faliure");
        });
    };
    
    
    $scope.validateName = function(){
    	var userResource = $resource('user/:name',{name:$scope.user.name},{query:{method:'GET',isArray:false}});
    	if($scope.user.name!=undefined){
	    	userResource.query({name:$scope.user.name},function(res){
	    		if(res.data!=null){
	    			$scope.validUsername=false;
	    		}else{
	    			$scope.validUsername=true;
	    		}
	    	});
    	}
    	else{
    		$scope.validUsername=true;
    	}
    };

});