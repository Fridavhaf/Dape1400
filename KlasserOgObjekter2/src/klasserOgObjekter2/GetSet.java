package klasserOgObjekter2;
class Personer{
    private int alder;

    public int getAlder(){
        return alder;
    }
    public void setAlder(int alder){
        if(alder>0){
            this.alder = alder;
        }
    }
}

public class GetSet {
    public static void main(String[] args){
        Personer person1 = new Personer();
        person1.setAlder(23);
        System.out.println("Personen sin alder er "+person1.getAlder()+" år.");
    }
}
