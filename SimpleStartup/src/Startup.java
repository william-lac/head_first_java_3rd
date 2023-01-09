class Startup {
    // first instance variables
    private int[] locationCells;
    private int numOfHits = 0;

    // methods
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            } // end if
        } //end for
        if (numOfHits == locationCells.length) {
            result = "kill";
        } // end if
        System.out.println(result);
        return result;
    }
} // close SimpleStartup Class

