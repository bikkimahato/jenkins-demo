pipeline {
  agent any
  stages {
    stage('Build') {
    steps {
      withMaven(maven : 'maven_3_8_1') {
          sh 'mvn clean install'
      }
    }
  }
  stage('Deploy') {
    steps {
      withMaven(maven : 'maven_3_5_0') {
          sh 'mvn deploy'
      }
    }
  }
  }
}