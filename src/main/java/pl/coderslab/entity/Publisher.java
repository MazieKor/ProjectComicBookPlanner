package pl.coderslab.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
//    @OneToMany(mappedBy = "publisher")
//    List<Purchase> purchase = new ArrayList<>();

//    @ManyToMany(mappedBy = "publisher")
//    List<Store> storeList = new ArrayList<>();

    @OneToMany(mappedBy = "publisher")
    List<StorePublisher> storePublisherList = new ArrayList<>();


}
