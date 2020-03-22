import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    int numOfGuess = 0;

    private void setUpGame(){
        DotCom dc1 = new DotCom();
        DotCom dc2 = new DotCom();
        DotCom dc3 = new DotCom();
        dc1.setName("Pets.com");
        dc2.setName("eToys.com");
        dc3.setName("Go2.com");
        dotComList.add(dc1);
        dotComList.add(dc2);
        dotComList.add(dc3);

        for(DotCom dc : dotComList){
            dc.setLocationCells(helper.placeDotCom(3));
        }
    }

    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userInput = helper.getUserInput("Enter a guess ");
            checkUserGuess(userInput);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuess++;
        String result = "miss";
        for(DotCom dc : dotComList){
            result = dc.checkYourself(userGuess);
            if(result == "hit"){
                break;
            }
            if(result == "kill"){
                dotComList.remove(dc);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless");
        if(numOfGuess <= 18){
            System.out.println("It only took you " + numOfGuess+ " guesses.");
            System.out.println("You got out before your options sank");
        }else{
            System.out.println("Took you long enough. " +numOfGuess+ " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
