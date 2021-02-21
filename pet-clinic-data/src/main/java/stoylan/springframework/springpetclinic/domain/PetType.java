package stoylan.springframework.springpetclinic.domain;

public class PetType extends BaseEntity {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
