pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch :'main',
                url='https://github.com/ruchithareddiie/internal'
            }
        }
        stage('Test') {
            steps {
                bat 'java test_factorial'
            }
        }
        stage('Run') {
            steps {
                bat 'java Factorial'
            }
        }
        stage('Packaging') {
            steps {
                bat 'jar cfm Factorial.jar Manifest.txt Factorial.class'
            }
        }
    }
    post {
        success {
            echo 'success'
        }
        failure {
            echo 'failure'
        }
    }
}
