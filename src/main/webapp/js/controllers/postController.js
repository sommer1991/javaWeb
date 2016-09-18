app.controller('blogCtrl',['$scope','$http',function($scope,$http){
	$http.get("data/author.json").success(function(data) {
         $scope.authorList = data.data;
     }).error(function(){
     	console.log("error");
     });

}]);