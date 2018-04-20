'use strict'

var module = angular.module('demo.controllers', []);
module.controller('pizzaController', [
    '$scope',
    function ($scope) {
        $scope.model = { title: 'Pizza Builder' ,
        availableToppings: ['Cheese', 'Pepperoni', 'Bacon', 'Pineapple', 'Sausage', 'Ham', 'Chicken', 'Mushrooms', 'Onion', 'Olives', 'Green Peppers'],
        toppings: [],
        toppingAdded: false
    };
    $scope.addTopping = function(value){
        $scope.model.toppings.push(value);
        $scope.model.search = null;
        $scope.model.toppingAdded = true;
    };
    $scope.changeStatus = function(value){
        $scope.model.toppingAdded = false;
    };
    }
]);