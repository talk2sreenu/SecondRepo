pipeline{
  agent any
    stages {
        stage ('one'){
            steps{
                echo 'Hi, This is Srinivasu'
            }
        }
        stage ('two'){
            steps{
                input('do you want to proceed?')
            }
        }
        stage ('three'){
            when{
                not{
                  branch "master"
                }
            }
            steps{
              echo 'Hello'
            }
        }
      }
  }    
