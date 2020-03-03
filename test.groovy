
def firstTest() {
    def response = httpRequest "https://raw.githubusercontent.com/Tarnn/GroovyTest/master/test.groovy"
    println('Status: '+response.status)
    println('Response: '+response.content)
}

return this
