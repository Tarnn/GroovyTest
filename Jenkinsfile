pipeline {
   agent any

   stages {
      stage('Hello') {
         steps {
           script {
         def externalMethod = load("test.groovy")
            externalMethod.firstTest()
            echo 'Hello World'
          }
         }
      }
   }
}
