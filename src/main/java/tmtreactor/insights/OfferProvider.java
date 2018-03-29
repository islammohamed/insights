package tmtreactor.insights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tmtreactor.model.Offer;

import java.util.ArrayList;

@Service
public class OfferProvider {
    private Authenticator authenticator;
    private RestTemplate restTemplate;
    private ApiConfig apiConfig;

    @Autowired
    public OfferProvider(Authenticator authenticator, RestTemplate restTemplate, ApiConfig apiConfig) {
        this.authenticator = authenticator;
        this.restTemplate = restTemplate;
        this.apiConfig = apiConfig;
    }

    /**
     * retrieve a list of offers through the insights api call
     * encapsulating the logic of retrieving the token at first.
     *
     * @return ArrayList<Offer>
     */
    public ArrayList<Offer> getAll() {
        String token = this.authenticator.authenticate();

        System.out.println("Token is " + token);

        // return restTemplate.getForObject(this.endpoint, Offer.class);
        ArrayList<Offer> offers = new ArrayList<Offer>();
        offers.add(new Offer("", ""));

        return offers;
    }
}