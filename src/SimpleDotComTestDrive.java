import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        Random random = new Random();
        int locationCell = random.nextInt(4);
        int numOfGuesses = 0;
        ArrayList<Integer> locationsList = new ArrayList<Integer>();
        locationsList.add(locationCell);
        locationsList.add(locationCell + 1);
        locationsList.add(locationCell + 2);

        dot.setLocationCells(locationsList);
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("enter & number ");
            String message = dot.checkYourself(scan.next());
            numOfGuesses++;
            System.out.println(message);
            if(message == "kill") break;
        }
        System.out.println("You took " +numOfGuesses + " guesses");
    }
}
