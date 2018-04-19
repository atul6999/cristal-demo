app.controller("menuController", ['$scope', function($scope){
    $scope.menu = "Menu";
    $scope.model = {title: 'MainTitle'};
    $scope.changeDish = function(newDish, price){
        $scope.model.mainDish = newDish;
        $scope.model.price = price;
    };
    $scope.$watch('model.mainDish', function(newValue, oldValue){
        if(newValue === 'BBQ Chicken Pizza'){
            alert("you have selected "+newValue);
        }
    });
}
]);