
def firstTest() {
    def response = httpRequest "https://jsonplaceholder.typicode.com/posts"
    println('Status: '+response.status)
    println('Response: '+response.content)
}

return this
