package pl.coderslab.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="bookStore")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotBlank
    String name;
    @Email
    String email;
    @Column(columnDefinition = "TEXT")
    String additionalInfo;

//    @ManyToMany
//    List<Publisher> publisher = new ArrayList<>();

    @OneToMany(mappedBy = "store")
    List<StorePublisher> storePublisherList = new ArrayList<>();

}
