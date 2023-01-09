import java.util.ArrayList;

public class Startup {
    // first instance variables
    private ArrayList<String> locationCells;
    // private int numOfHits = 0;
    // do not need numOfHits anymore as we're using ArrayList

    // methods
    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

//        for (int cell : locationCells) {
//            if (guess == cell) {
//                result = "hit";
//                numOfHits++;
//                break;
//            } // end if
//        } //end for
//        if (numOfHits == locationCells.length) {
//            result = "kill";
//        } // end if
//        System.out.println(result);
//        return result;
//    }
//} // close SimpleStartup Class

