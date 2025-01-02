package com.i27academy.builds;
class Calculator {
    def jenkins  //variable definition to hold jenkins context 
    Calculator(jenkins){      // constructor to initiate the context
        this.jenkins = jenkins   //gives Calculator access to jenkins context
    }

    def add(firstNumber, secondNumber){
    return firstNumber + secondNumber
    }

    def multiply(firstNumber, secondNumber){
    return firstNumber*secondNumber
    }
}