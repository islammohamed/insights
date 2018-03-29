package tmtreactor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Offer {
    private String id;
    private String trackingUrl;

    public Offer(String id, String trackingUrl) {
        this.id = id;
        this.trackingUrl = trackingUrl;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Offer" + id + " " + trackingUrl;
    }
}
