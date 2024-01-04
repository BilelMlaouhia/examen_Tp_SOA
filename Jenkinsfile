pipeline{
    agent any
    environment{
        mvnhome = 'C:/Users/Bilel/Downloads/apache-maven-3.8.8'
    }
    stages{
        stage('Build'){
            steps{
                if(isUnix()){
                    sh "'${mvnhome}/bin/mvn' clean install"}


                if (!isUnix()) {
                    bat label: 'Build', script: "\"${mvnhome}/bin/mvn\" clean install"}
                }
            }
        }
    }
