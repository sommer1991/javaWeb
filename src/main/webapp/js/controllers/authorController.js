app.controller('authorCtrl',['$scope','$http',function($scope,$http){
	
	$http.get("data/author.txt").success(function(data) {
         $scope.authorList = data.data;
     }).error(function(){
     	console.log("error");
     });

}]);