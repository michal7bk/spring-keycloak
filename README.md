### Simple application which is able to integrate as OAuth2 Client with Keycloak, and can provide functionality as a Resource Server.
# Keycloak download
https://www.keycloak.org/downloads

To start local keycloak
> ~/projects/inetum-presentation/keycloak-25.0.2/bin$ ./kc.sh start-dev --log-level=DEBUG

# Master realm with default credentials:
http://localhost:8080/admin/master/console/#/myrealm/clients
admin:admin

# Spring-boot
API require authentication and authorization: http://localhost:8081/currentUser
API require authentication: http://localhost:8081/public

# Postman
Token Name
Enter a token name...

Grant type  : Authorization Code
Callback URL : http://localhost:8081/login/oauth2/code/keycloak

Auth URL : http://localhost:8080/realms/myrealm/protocol/openid-connect/auth
Access Token URL : http://localhost:8080/realms/myrealm/protocol/openid-connect/token
Client ID : myclient
Scope : openid

