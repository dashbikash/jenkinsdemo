pipeline{
    agent { docker { image 'maven:3.8.4-openjdk-11-slim' } }
    stages{
        stage('build'){
            steps{
                echo 'Building ...'
            }
        }
        stage('test'){
            steps{
                echo 'Testing ...'
            }
        }        
        stage('deploy'){
            steps{
                echo 'Deploying ...'
            }
        }
    }
}
