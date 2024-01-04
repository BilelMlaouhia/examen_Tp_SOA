pipeline{
    agent any
    environment{
        mvnhome = 'C:/Users/Bilel/Downloads/apache-maven-3.8.8'
    }
    stages{
        stage('Checkout'){
            git 'https://github.com/BilelMlaouhia/examen_Tp_SOA.git'
            mvnhome = 'C:/Users/Bilel/Downloads/apache-maven-3.8.8'
        }
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
