package project.groomer.models;

import javax.persistence.*;
import java.util.List;


public enum Treatment {

     CUT ("cut" ),
    WASH( "wash" ),
    DRY("dry");



    public  String name;

    Treatment() {
    }

    Treatment(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }





}
