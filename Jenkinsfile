pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/chpcj4/my-app.git'
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
                echo "여기에 k8s 배포 스크립트 넣을 수 있어"
            }
        }
    }
}
