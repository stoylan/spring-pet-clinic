package stoylan.springframework.springpetclinic.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    @Column(name="description")
    private String description;

    @ManyToMany(mappedBy = "specialities")
    private Set<Vet> vets = new HashSet<>();

}
