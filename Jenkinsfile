pipeline {
    agent any  // Run this pipeline on any available Jenkins agent

    stages {
        stage('Checkout') {
            steps {
                echo 'Step: Checking out code from repository'
                // Example: git url: 'https://github.com/your-repo.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Step: Building the application'
                // Example: sh 'mvn clean install'
				
            }
        }

        stage('Test') {
            steps {
                echo 'Step: Running unit tests'
                // Example: sh 'mvn test'
				
            }
        }

        stage('Deploy') {
            steps {
                echo 'Step: Deploying to production server'
                // Example: sh './deploy.sh'
            }
        }
    }
}
