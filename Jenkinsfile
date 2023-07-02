pipeline {

    agent any
    stages {
        stage('Build App') 
             {
            steps 
             {
                echo 'Building application'
             }
        }
      stage('Test App') 
            {
            steps 
              {
                echo 'Testing application'
              }
        }
        stage('Deploy App') 
            {
            steps 
             {
                echo 'Deploying application'
            }
        }
    }
    
    post
{

always {
            emailext body: '', subject: 'pipeline status', to: 'jaya.javateam2019@gmail.com'
        }
}
}
