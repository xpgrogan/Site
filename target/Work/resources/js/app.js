var app = angular.module("myApp", [])


.controller('HelloController', ['$scope', function($scope) {
    $scope.name = "Emiya Shirou";

    $scope.getMember = function() {
        console.log($scope.name);
    };
}]);