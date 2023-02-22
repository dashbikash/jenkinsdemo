pipeline{
	agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages{
        stage('build'){
            steps{
                sh './mvnw clean install'
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
