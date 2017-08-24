var app = angular.module("myApp", [])


    .controller('HelloController', ['$scope', function($scope) {
        $scope.name = "Emiya Shirou";
    }])
    .controller('UserController', ['$scope', function($scope){
        $scope.user = "xpgrogan";
        $scope.test = function() {
            console.log("test");
        }
    }]);