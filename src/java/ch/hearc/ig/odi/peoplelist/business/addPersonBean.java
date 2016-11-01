package ch.hearc.ig.odi.peoplelist.business;

import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@Named(value = "addPersonBean")
@RequestScoped

public class addPersonBean {
    
    @Inject Services services;
    
    private Person person;

    public addPersonBean() {
        person = new Person();
    }
    
    public void savePerson(){
        services.savePerson(person.getGender(), person.getFirstName(), person.getLastName(), person.getMarried(), person.getBirthDate());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
}