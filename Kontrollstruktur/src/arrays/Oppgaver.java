package arrays;

public class Oppgaver {
    public static void main (String [] args){
        int [] heltall = {45, 34, 5, 8, 10, 2, 13, 25};

        //Tips: Start fra array.length - 1 så lenge telleren i for-løkka er større eller lik 0.
        // Mink telleren med en hver gang.
        for (int i = heltall.length - 1;  i >= 0; i-=1){
            System.out.print(heltall[i] + " ");

        }
    }
}