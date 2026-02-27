pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/AbdulrahmanHamid/DevOpsWebapp.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvnw.cmd clean package'
            }
        }
    }
}
