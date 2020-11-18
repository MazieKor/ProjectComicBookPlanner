package pl.coderslab.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
//    String name;
//    String email;
//
//    @ManyToMany
//    List<Publisher> publisher = new ArrayList<>();
//
//    @Column(columnDefinition = "TEXT")
//    String additionalInfo;
//
}
