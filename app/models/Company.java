package models;

import javax.persistence.*;

@Entity
public class Company extends Model {
    @Id
    @GeneratedValue
    public Long id;

    public String name;

    public Company(String name) {
        this.name = name;
    }
}
