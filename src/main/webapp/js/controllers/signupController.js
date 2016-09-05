app.controller('signupCtrl', function ($scope, $resource, $window) {
    var User = $resource('user', { id: '@id' });
    $scope.signup = function () {
        User.save($scope.user, function (result) {
            console.log(result);
            alert("success");
            // $window.location.reload();
        });
    };
});