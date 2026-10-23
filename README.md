# OA2-Client

OAuth2 Client developed using Spring Security.

- Uses Google Authorization Server.

### Steps to set up Google Authorization Server:

1. Login to Google Cloud Console and select a project.
2. Go to APIs & Services → Credentials → Create credentials → OAuth client ID.
3. Setup Consent Screen and Create OAuth client ID.
4. Add redirect URI (http://localhost:8080/login/oauth2/code/google) provided by the **spring-boot-starter-security-oauth2-client** dependency.
5. Client ID & Secret will be generated. Copy them. 
6. Create a .env file in the project root directory and add the following content.

```text
CLIENT_ID=Your copied Client ID
CLIENT_SECRET=Your copied Client Secret
```

7. Select the generated OAuth client and go to Data Access.
8. Add scopes for email and profile and Save it.
9. Your Authorization Server is ready for use.
