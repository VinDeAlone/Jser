pipeline{
    agent any
    tools{
        maven "Maven"
    }
    stages{
        stage("build project"){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/VinDeAlone/Jser']])
                powershell "mvn clean install"
            }
        }
        stage("build docker image"){
            steps{
                powershell "docker build -t vindealone/demoservicejenkinsimage:1.0.2 ."
            }
        }
        stage("push image to docker hub"){
            steps{
                withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerpwd')]) {
                    powershell "docker login -u vindealone -p ${dockerpwd}"
                }
                powershell "docker push vindealone/demoservicejenkinsimage:1.0.2"
            }
        }
    }
}