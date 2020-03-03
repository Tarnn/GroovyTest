@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7')

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
