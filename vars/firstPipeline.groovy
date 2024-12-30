//import the Calculator class
import com.i27academy.builds.Calculator
def call(Map pipelineParams) { 
    
//creating  'calculator' instance 
//pass the current pipeline context using this

Calculator calculator = new Calculator(this)
    pipeline {
    agent any 
    environment {
        APP_NAME = ${pipelineParams.appName}
    }
    stages {
        stage ('Addition Stage') {
            steps {
                echo "addition of 2 numbers"
                println calculator.add(10,40)
                echo "my microservice is: ${APP_NAME}"
            }
        }
    }
    }
}

