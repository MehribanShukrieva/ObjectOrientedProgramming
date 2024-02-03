class Patient{
private int patientId;
static int counter;
private String name;
private float temperature=36.5f;
public static final String doctor="Jone";
public Patient(String name, float temp,String doctor){
    this(name,temp,++counter,doctor);    
}
 private Patient(String name, float temp,int pId,String doctor){
    this.name=name;
    this.temperature= temp;
    this.patientId= pId;
    this.name= doctor;

 }
 public String getName(){
     return this.name;
 }
public int getId(){
     return this.patientId;
 }

public String toString(){
    return this.patientId+"Name:"+this.name+"\ntemperature: "+this.temperature;
}
}
public class Hospital {
    public static void main(String[] args) {
     Patient patient1= new Patient("Derya", 37.2f, "Telli");
        System.out.println(patient1);
     Patient patient2= new Patient("Zilan", 37.2f, "Temel");
        System.out.println(patient2.getName());
    Patient patient3= new Patient("Mustafa", 37.2f, "Songur");
        System.out.println(patient2);
        System.out.println("number of patients:"+Patient.counter);
    }
}
