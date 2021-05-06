pipeline {

    agent any
    stages {
            stage ('Build') {

                steps {
                   withMaven {
                         echo "building"
                   }
                }
            }

            stage ('Deployment Stage') {
                steps {
                    withMaven {
                         echo "deploying"
                   }
                }
            }
        }

}