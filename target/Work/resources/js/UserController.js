app.controller('UserController', ['$scope', function($scope){
    $scope.user = "xpgrogan";
    $scope.test = function() {
        console.log("test");
    }
}])