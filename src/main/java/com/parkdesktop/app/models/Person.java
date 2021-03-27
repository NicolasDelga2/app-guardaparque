package com.parkdesktop.app.models;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class Person {

    private String firstname;
    private String lastname;
    private String dni;

    private LocalDate bornDay;

}
