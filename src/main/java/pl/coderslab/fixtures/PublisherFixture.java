package pl.coderslab.fixtures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.coderslab.entity.Publisher;
import pl.coderslab.service.PublisherService;

@Component
public class PublisherFixture implements Fixture     {
    private PublisherService publisherService;

    @Autowired
    public PublisherFixture(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    public void createFixture(){
        Publisher publisher = new Publisher();
        publisher.setName("Egmont");
        publisherService.save(publisher);

        Publisher publisher2 = new Publisher();
        publisher2.setName("Mucha");
        publisherService.save(publisher2);

        Publisher publisher3 = new Publisher();
        publisher3.setName("Scream");
        publisherService.save(publisher3);


        Publisher publisher4 = new Publisher();
        publisher4.setName("Non Stop");
        publisherService.save(publisher4);

        Publisher publisher5 = new Publisher();
        publisher5.setName("Kurc");
        publisherService.save(publisher5);

    }

}
