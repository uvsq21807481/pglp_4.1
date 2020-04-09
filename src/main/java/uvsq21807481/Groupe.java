package uvsq21807481;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Groupe {

    private List<Personnel> groupe;
    private String name;

    public Groupe(String name){
        this.groupe = new ArrayList<Personnel>();
        this.name = name;
    }

    public void addPersonnel(Personnel p){
        this.groupe.add(p);
    }

    public List<Personnel> getGroupe(){
        List<Personnel> liste = Collections.unmodifiableList(groupe);
        return liste;
    }

    public String getName() {
        return name;
    }
}
