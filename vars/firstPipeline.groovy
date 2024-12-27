
//import the Calculator class
import com.i27academy.builds.Calculator

//creating an instance of Calculator 
//pass the current pipeline context using 'this'
 
Calculator calculator = new Calculator(this)
pipeline {
    agent any 
    stages {
        stage ('Addition Stage') {
            steps {
                script {
                    echo "printing sum of 2 numbers"
                    println calculator.add(10,20)
                }
            }
        }
        stage ('Mailing Stage') {
            steps {
                echo "sending a Mail!!!"
            }

        } 
    }
}