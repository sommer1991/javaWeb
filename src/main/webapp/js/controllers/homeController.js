app.controller('homeCtrl',['$scope','$resource',function($scope,$resource){
	
	/*$scope.postList = [
	                   {"id":2,
						"date":1472947200000,
						"authorName":"wei",
						"content":"Sunny day",
						"likes":0,
						"commentList":[
						    {"id":0,
							"cDate":1472947200000,
							"cContent":"good",
							"cAuthorName":"sommer",
							"postId":0},
							{"id":0,
								"cDate":1472947200000,
								"cContent":"I like it",
								"cAuthorName":"winter",
								"postId":0}]},
						{"id":1,
						  "date":1472947200000,
						  "authorName":"sommer",
						  "content":"first post",
						  "likes":0,
						  "commentList":[{
							"id":0,
							"cDate":1472947200000,
							"cContent":"good",
							"cAuthorName":"sommer",
							"postId":0}]}];*/


//	var user = $cookieStore.get("user");
//	console.info(user);
	$scope.showPosts = function() {
    	var postResource = $resource('post/show', {}, {query:{method:'GET',isArray:false}});
    	postResource.query({},function(res){
    		console.log(res.data);
    		$scope.postList = res.data;
    	}, function (res) {
        	console.log("error");
        });
    };
    
    $scope.addPost = function() {
    	var postResource = $resource('post/new', {}, {save:{method:'POST'}});
    	$scope.post.authorName = user.name;
    	postResource.save({},$scope.post,function (res) {
    	}, function (res) {
        	console.log("error");
        });
    };
    $scope.addComment = function(id) {
    	var commentResource = $resource('comment/new', {}, {save:{method:'POST'}});
    	$scope.comment.cAuthorName = user.name;
    	commentResource.save({},$scope.comment,function (res) {
    	}, function (res) {
        	console.log("error");
        });
    };

    $scope.likeOrNot = function(id,flag) {
    	var postResource = $resource('post/likes/:id/:flag', {id:id,flag:flag}, {save:{method:'GET'}});
    	userResource.save({id:id,flag:flag},function (res) {
    	}, function (res) {
        	console.log("error");
        });
    };
    $scope.showPosts();
}]);