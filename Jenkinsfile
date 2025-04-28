pipeline {
    agent any

    environment {
        MAVEN_HOME = "${tool 'maven'}"  // 만약 Jenkins에 Maven 툴 설치되어 있으면
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/chpcj4/my-app.git'
            }
        }
        
        stage('Build') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        
        stage('Docker Build') {
            steps {
                sh 'docker build -t my-app-image .'
            }
        }
        
        stage('Deploy (Optional)') {
            steps {
                echo "Kubernetes에 배포하거나, 추가 작업을 여기에 작성할 수 있어."
            }
        }
    }
}
