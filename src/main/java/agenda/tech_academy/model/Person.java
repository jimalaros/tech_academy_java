package agenda.tech_academy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Person {
    private String personId;
    private String namePerson;
    private String email;
    private String phone;
    
    public Person(String namePerson, String email, String phone) {
        this.namePerson = namePerson;
        this.email = email;
        this.phone = phone;
    }
}
