package pl.coderslab.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="shopPublisher")
public class StorePublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Double discount;

    @NotNull
    @ManyToOne
    Store store;

    @NotNull
    @ManyToOne
    Publisher publisher;
}
