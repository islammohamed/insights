package tmtreactor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tmtreactor.insights.OfferProvider;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    OfferProvider offerProvider;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run();


    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting the console app.");
        try {
            offerProvider.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
