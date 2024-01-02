public class Legends {
    private String[] characters = {"Ash", "Ballistic", "Bangalore", "Bloodhound", "Catalyst", "Caustic", "Conduit", "Crypto", "Fuse", "Gibraltar","Horizon", "Lifeline",
        "Loba", "Mad Maggie", "Mirage","Newcastle", "Octane", "Pathfinder","Rampart", "Revenant","Seer","Valkyrie","Vantage","Wattson", "Wraith"};
    
    public String getRandomLegend(){
        int randomNum = (int) ((Math.random()) * characters.length);
        return characters[randomNum];

    }
   
}

    
    
