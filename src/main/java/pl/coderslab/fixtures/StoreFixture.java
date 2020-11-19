package pl.coderslab.fixtures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.coderslab.entity.Publisher;
import pl.coderslab.entity.Store;
import pl.coderslab.service.PublisherService;
import pl.coderslab.service.StoreService;

@Component
public class StoreFixture implements Fixture {
    private StoreService storeService;

    @Autowired
    public StoreFixture(StoreService storeService) {
        this.storeService = storeService;
    }

    public void createFixture(){
        Store store = new Store();
        store.setName("Bonito");
        storeService.save(store);

        Store store2 = new Store();
        store2.setName("Nieprzeczytane");
        storeService.save(store2);

        Store store3 = new Store();
        store3.setName("Fantastyczne Swiaty");
        storeService.save(store3);

        Store store4 = new Store();
        store4.setName("Gildia");
        storeService.save(store4);

    }
}
