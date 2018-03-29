package tmtreactor.insights;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiConfig {
    @Value("${insight.endpoint}")
    private String endpoint;
}
