pipeline {
    agent any
        environment {
        DOCKERHUB_PWD = credentials('CredentialID_DockerHub')
    }
    
    stages {
        // Stage 1: Check out the source code from GitHub
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/AbdulrahmanHamid/DevOpsWebapp.git'
            }
        }
        
        // Stage 2: Build the Maven project into a .jar file
        stage('Build Maven Project') {
            steps {
                bat 'mvnw.cmd clean package -DskipTests'
            }
        }
        
        // Stage 3: Log into Docker Hub using the credentials
        stage('Docker Login') {
            steps {
                bat 'docker login -u abdulrahman2011 -p %DOCKERHUB_PWD%'
            }
        }
        
        // Stage 4: Build the Docker image
        stage('Docker Build') {
            steps {
                bat 'docker build -t abdulrahman2011/comp367-webapp:1.0 .'
            }
        }
        
        // Stage 5: Push the Docker image to Docker Hub
        stage('Docker Push') {
            steps {
                bat 'docker push abdulrahman2011/comp367-webapp:1.0'
            }
        }
    }
}
