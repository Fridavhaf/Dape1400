package klasserOgObjekter2;

class Person{
    public String navn;
    public int fødselsår;

    public Person (String navn, int fødselsår){ //konstruktøren
        this.navn = navn; //Vi tilorder navnet som kommer inn her til this.navn. This betyr klassen sitt navn
        this.fødselsår = fødselsår;

    }
}
public class Konstruktør {
    public static void main(String[]args){
        Person person1 = new Person("Line Jensen", 1999);

        //Nå gjør vi ikke følgende:
        //person1.navn = "Line Jensen";
        //person1.fødselsår = "1999;
        //Det er allerede gjort i påkallingen av konstruktøren og konstruktøren med attributtene som må inn
        System.out.println(person1.navn+" er født i "+person1.fødselsår);


    }
}
