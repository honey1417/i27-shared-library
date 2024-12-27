package com.i27academy.builds;
class Calculator {
    //variable definition
    def jenkins
    //constructor
    Calculator(jenkins) {
        this.jenkins = jenkins
    }

    //methods
    def add(firstNumber, secondNumber){
        //body
        //firstNumber = 10
        //secondNumber = 20
        //sum = firstNumber + secondNumber
        //println sum
        return firstNumber+secondNumber
    }
    def multiply(firstNumber, secondNumber){
        //body
        return firstNumber*secondNumber
    }
}