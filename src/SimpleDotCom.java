import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> locationCells;

    public String checkYourself(String userGuess){
        String messege = "miss";
        int guess = Integer.parseInt(userGuess);
        int index = locationCells.indexOf(guess);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                messege = "kill";
            }
            else{
                messege = "hit";
            }
        }
        return messege;
    }

    public void setLocationCells(ArrayList<Integer> cellLocations){
        // 同じオブジェクトを参照させる。
        locationCells = cellLocations;
    }
}
