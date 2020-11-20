package pl.coderslab.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
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

    @NotBlank(message="Podanie tytułu jest wymagane")
    String title;
    Integer issueNumber;
    @NotNull
    @ManyToOne
    Publisher publisher;
    @NotNull
    Double price;

    @Min(0)
    @Max(10)
    Integer urgency;
    String category;
    String series;
    String subtitle;

//    @Transient
//    int year;
//    @Transient
//    int month = 12;
    LocalDate issueDate; //= LocalDate.of(year, month,1);

//    boolean onlyNew;
    @Column(columnDefinition = "TEXT")
    String info;

//    @ManyToOne
//    Flow.Publisher publisher;
//    @ManyToMany(fetch = FetchType.EAGER)
//    List<Author> author = new ArrayList<>();

}
