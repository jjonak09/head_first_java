import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public String checkYourself(String userGuess){
        String messege = "miss";
        int index = locationCells.indexOf(userGuess);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                messege = "kill";
                System.out.println("Ouch!You sunk " + name + " :( ");
            }
            else{
                messege = "hit";
            }
        }
        return messege;
    }

    public void setLocationCells(ArrayList<String> cellLocations){
        // 同じオブジェクトを参照させる。
        locationCells = cellLocations;
    }

    public void setName(String name){
        this.name = name;
    }


}
