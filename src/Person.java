
import java.util.ArrayList;

public class Person {String Firstname;
    private String Lastname;
    private ArrayList<Long> a;
    private String email;
    Person(String Firstname,String Lastname,ArrayList<Long> a,String email){
        this.a=a;
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.email=email;
    }


    public void setA(ArrayList<Long> a) {
        this.a = a;
    }
    public String getA() {
        String b="";
        int c=0;
        for (int i = 0; i <a.size()-1 ; i++) {
            b=b+a.get(i)+",";
        }
        return b+a.get(a.size()-1);}
    public String getEmail() {
        return email;
    }
    public String getFirstname() {
        return Firstname;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}