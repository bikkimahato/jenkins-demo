pipeline {

    agent any
    stages {
            stage ('Build') {

                steps {
                   withMaven {
                         sh "mvn clean verify"
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