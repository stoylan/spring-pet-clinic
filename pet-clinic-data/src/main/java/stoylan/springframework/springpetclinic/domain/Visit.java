package stoylan.springframework.springpetclinic.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "local_date")
    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @Column(name = "description")
    private String description;

}
