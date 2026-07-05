pipeline {
    agent any
    tools {
        maven "maven-3.8.1"
    }

    stages {
        stage('Git checkout') {
            steps {
                // Get some code from a GitHub repository
               git branch: 'main', credentialsId: '91a6da51-fb44-476e-825f-3591896b0e0e', url: 'https://github.com/Prashantg93/student-management-system-springboot.git'
            }
        }
        
          stage('clean and Install') {
            steps {
                // Get some code from a GitHub repository
                bat 'mvn clean install'
            }
        }
        
        stage('Package') {
            steps {
                // Get some code from a GitHub repository
                bat 'mvn package'
            }
        }
    }
}
