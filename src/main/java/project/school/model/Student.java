package project.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@NoArgsConstructor //'cause "Hibernate" It's going to create a constructor by class student
@Table(name = "student")
@Getter
@Setter
public class Student {
    @Id
    private int dni;
    private BigInteger codStudent;
    private int numOrden;
    private String names;
    private String lastname;
}
