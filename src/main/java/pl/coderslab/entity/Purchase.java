package pl.coderslab.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.Flow;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column //(nullable = false)
    String title;
//    @NotNull
//    @ManyToOne
//    Publisher publisher;
//    @NotNull
//    String category;
//    Integer price;
//    @Min(1)
//    @Max(10)
//    Integer urgency;
//
//    String series;
//    String subtitle;
//    Double issueNumber;
//    LocalDate issueDate;
//
//    boolean onlyNew;
//    @Column(columnDefinition = "TEXT")
//    String info;

//    @ManyToOne
//    Flow.Publisher publisher;
//    @ManyToMany(fetch = FetchType.EAGER)
//    List<Author> author = new ArrayList<>();

}
