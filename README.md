# Keycloak
https://docs.google.com/presentation/d/1n8i2Ay7hadwSGNzhRiAVWqT8ARuYkHXMGMMt4cEBuwE/edit#slide=id.p

To start local keycloak
> ~/projects/inetum-presentation/keycloak-25.0.2/bin$ ./kc.sh start-dev --log-level=DEBUG

http://localhost:8080/admin/master/console/#/myrealm/clients
admin:admin

Realm ID: myrealm
Client ID: myclient
role: reader
users: michal:1qaz@WSX

# Spring-boot
http://localhost:8081/currentUser

# Postman
Token Name
Enter a token name...

Grant type  : Authorization Code
Callback URL : http://localhost:8081/login/oauth2/code/keycloak

Auth URL : http://localhost:8080/realms/myrealm/protocol/openid-connect/auth
Access Token URL : http://localhost:8080/realms/myrealm/protocol/openid-connect/token
Client ID : myclient
Scope : openid

