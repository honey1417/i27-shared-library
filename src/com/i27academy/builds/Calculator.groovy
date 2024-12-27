
package com.i27academy.builds;
class Calculator {

    //variable definition
    def jenkins // holds the jenkins context

    //constructor to initiate the context
    Calculator(jenkins) {

        //this.jenkins Refers to the jenkins variable defined 
        //within the current class (Calculator)
        //Passing 'this' to the constructor gives the 
        //Calculator access to Jenkins context

        this.jenkins = jenkins 
                       //jenkins-->constructor parameter
    }

    //methods
    def add(firstNumber, secondNumber){
        //body
        return firstNumber+secondNumber
    }
    def multiply(firstNumber, secondNumber){
        //body
        return firstNumber*secondNumber
    }
}