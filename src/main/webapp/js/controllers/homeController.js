app.controller('homeCtrl',['$scope','$resource','$location',function($scope,$resource,$location){
	
	var username = getCookie("username");
	console.log("cookies...",username);
	if(username=='undefined'){
		$location.path("/signin");
	}
	$scope.showPosts = function() {
    	var postResource = $resource('post/show', {}, {query:{method:'GET',isArray:false}});
    	postResource.query({},function(res){
    		$scope.postList = res.data;
    	}, function (res) {
        	console.log("error");
        });
    };
    
    $scope.addPost = function() {
    	var postResource = $resource('post/new', {}, {save:{method:'POST'}});
    	$scope.post.authorName = username;
    	postResource.save({},$scope.post,function (res) {
    		$scope.showPosts();
    	}, function (res) {
        	console.log("error");
        });
    };
    $scope.setReplyPostId = function(id){
    	$scope.replyPostId = id;
    }
    $scope.addComment = function() {
    	$scope.comment.cAuthorName = username;
    	$scope.comment.postId=$scope.replyPostId;
    	var commentResource = $resource('comment/new', {}, {save:{method:'POST'}});
    	commentResource.save({},$scope.comment,function (res) {
    		$scope.showPosts();
    	}, function (res) {
        	console.log("error");
        });
    };

    $scope.likeOrNot = function(id,flag) {
    	console.log(id,'...',flag);
    	var postResource = $resource('post/likes/:id/:flag', {id:id,flag:flag}, {save:{method:'GET'}});
    	postResource.save({id:id,flag:flag},function (res) {
    		$scope.showPosts();
    		 
    	}, function (res) {
        	console.log("error");
        });
    };
    $scope.showPosts();
	

}]);