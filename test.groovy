
@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7')
import groovyx.net.http.HTTPBuilder;

def firstTest() {

         def baseUrl = new URL('https://jsonplaceholder.typicode.com/posts')
         HttpURLConnection connection = (HttpURLConnection) baseUrl.openConnection();
         connection.addRequestProperty("Accept", "application/json")
         connection.with {
           doOutput = true
           requestMethod = 'GET'
           println content.text
         }
}

return this
