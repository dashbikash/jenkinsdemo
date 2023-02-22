pipeline{
	agent any
    triggers {
        pollSCM '* * * * *'
    }
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
