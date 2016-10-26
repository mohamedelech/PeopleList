package ch.hearc.ig.odi.peoplelist.business;

import ch.hearc.ig.odi.peoplelist.service.Services;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@Named(value = "peopleListBean")
@RequestScoped

public class peopleListBean {
    
    @Inject Services services;

    public peopleListBean() {
        
    }
    
    public List getPeopleList(){
        return services.getPeopleList();
    }
    
}