pipeline {

    agent any
    stages {
            stage ('Build') {

                steps {
                   withMaven {
                         sh "mvn clean install"
                   }
                }
            }

            stage ('Deployment Stage') {
                steps {
                    withMaven {
                         sh "mvn deploy"
                   }
                }
            }
        }

}