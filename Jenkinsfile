pipeline{
    agent any
    environment{
        mvnhome = 'C:/Users/Bilel/Downloads/apache-maven-3.8.8'
    }
    stages{
        stage('Build'){
            steps{
                script{
                    if(isUnix()){
                        sh "'${mvnhome}/bin/mvn' clean install"
                    }else {
                        bat "\"${mvnhome}/bin/mvn\" clean install"}
                    }
                }

            }
        }
    }
