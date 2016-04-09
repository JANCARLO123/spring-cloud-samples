# Spring Cloud Samples

Spring Cloud sample applications to show several capabilities related to distributed systems construction.

## Spring Cloud Config

This version shows how to develop a __config server__ serving configuration files from a git repository, and a client application consuming configuration files from the config server. The client application needs to know the url of the config server, so if domain names or ips change, the config application needs at least a restart to apply the new config server location.

### Default configuration for server

* Runs on localhost:8888 (default port for config servers).
* Reads configuration files from github repository located at https://github.com/codeurjc/spring-cloud-config-server-repo

### Default configuration for client

* Connects to config server at http://localhost:8888
* Reads configuration from server, and as a result, the app should be available at http://localhost:9090 (instead of using the default 8080 port)

There are integration tests on both server and client.
