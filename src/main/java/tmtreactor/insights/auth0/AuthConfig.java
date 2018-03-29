package tmtreactor.insights.auth0;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:auth0.properties")
public class AuthConfig {
    final String CONNECTION_TYPE = "Username-Password-Authentication";
    final String SCOPE = "openid app_metadata";


    @Value("${com.auth0.clientId}")
    private String clientId;

    @Value("${com.auth0.domain}")
    private String domain;

    @Value("${com.auth0.username}")
    private String username;

    @Value("${com.auth0.password}")
    private String password;

    public AuthConfig() {
    }

    public String getClientId() {
        return clientId;
    }

    public String getDomain() {
        return domain;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
