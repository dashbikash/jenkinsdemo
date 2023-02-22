pipeline{
	agent any
    triggers {
        pollSCM '1/3 * * * *'
    }
    stages{
        stage('build-package'){
            steps{
                sh './mvnw clean install'
            }
        }
        stage('build-image'){
            steps{
                sh 'docker build . -t bikashpdash/jenkins-java'
            }
        }        
        stage('deploy'){
            steps{
                sh 'docker run --rm --name jenkins-java -dp 9000:8088 bikashpdash/jenkins-java' 
            }
        }
    }
}
