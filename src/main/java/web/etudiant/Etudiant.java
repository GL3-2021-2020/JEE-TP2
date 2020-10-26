package web.etudiant;

import java.util.ArrayList;

public class Etudiant {
    public  static ArrayList<Etudiant> etudiantList = new ArrayList<>() ;
    public String cin;
    public String name;
    public String lastName;

    public Etudiant(String cin, String name, String lastName) {
        this.cin = cin;
        this.name = name;
        this.lastName = lastName;
    }
}
