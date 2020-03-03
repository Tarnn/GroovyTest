@Grapes([
    @Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7'),
    @Grab('org.apache.httpcomponents:httpmime:4.5.1')
])
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
