package tmtreactor.insights.auth0;

import com.auth0.Auth0;
import com.auth0.authentication.AuthenticationAPIClient;
import com.auth0.request.AuthenticationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tmtreactor.insights.Authenticator;

@Component
public class DatabaseAuthenticator implements Authenticator {


    @Autowired
    AuthConfig authenticationConfig;

    @Override
    public String authenticate() {
        AuthenticationAPIClient client = new AuthenticationAPIClient(
                new Auth0(authenticationConfig.getClientId(), authenticationConfig.getDomain()));

        AuthenticationRequest ar = client.login(authenticationConfig.getUsername(), authenticationConfig.getPassword());
        ar.setConnection(authenticationConfig.CONNECTION_TYPE);
        ar.setScope(authenticationConfig.SCOPE);

        return ar.execute().getIdToken();

    }
}
