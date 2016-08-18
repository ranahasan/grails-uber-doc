package uber.doc

import grails.plugins.*

class UberDocGrailsPlugin extends Plugin {

    def grailsVersion = "2.4 > *"
    def pluginExcludes = [
            '**/sample/**',
            "**/uber/doc/Application*",
            "test/**"
    ]

    def title = "UberDoc - Rest-API Documentation" // Headline display name of the plugin
    def author = "Felipe Carvalho"
    def authorEmail = "felipe@uberall.com"
    def description = '''\
uberDoc is a very simple solution for creating API documentation based on annotations in domain objects and controllers, and Grails' message system.

It goes through controllers, finds resources, fetches all used objects, and extracts all parameters, headers, errors, etc.

For more documentation, see our GitHub repository.
'''

    def documentation = "https://github.com/uberall/grails-uber-doc"
    def license = "BSD"
    def organization = [name: "uberall", url: "https://uberall.com/"]
    def developers = [[name: "Florian Langenhahn", email: "florian.langenhahn@uberall.com"], [name: "Florian Huebner", email: "florian@uberall.com"], [name: "Philipp Eschenbach", email: "philipp@uberall.com"]]
    def issueManagement = [system: "GitHub", url: "https://github.com/uberall/grails-uber-doc/issues"]
    def scm = [url: "https://github.com/uberall/grails-uber-doc/"]
}