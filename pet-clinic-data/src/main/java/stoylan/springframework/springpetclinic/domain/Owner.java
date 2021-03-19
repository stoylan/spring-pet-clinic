package stoylan.springframework.springpetclinic.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Builder
    public Owner(Long id,String name,String username,String address, String city, String telephone) {
        super(id,name,username);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    @Column(name = "address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pet = new HashSet<>();

}
