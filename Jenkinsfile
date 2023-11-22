pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/KonahDJ/MySpringBootApp.git'

                // Run Maven Wrapper Commands
                sh "./mvnw compile"

                echo "Building the Project with Maven Compile"
            }
        }
        
        stage('Test') {
            steps {
                // Run Maven Wrapper Commands
                sh "./mvnw test"

                echo 'Testing the Project with Maven Test'
            }
        }
        
        stage('Deploy') {
            steps {
                // Run Maven Wrapper Commands
                sh "./mvnw package"

                echo 'Deploying the Project with Maven Package'
            }
        }
    }
}
