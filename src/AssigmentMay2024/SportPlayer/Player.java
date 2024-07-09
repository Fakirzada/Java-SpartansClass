package AssigmentMay2024.SportPlayer;

public class Player {

    /*
    Project: Sports Player Database

Objective: Demonstrate single inheritance with a sports theme.

Steps:

    1. Create a base class called Player.
    2. Define private member variables: name (type String) and team (type String).
    3. Provide a constructor to initialize these variables.
    4. Implement public methods getName() and getTeam() to access these variables.
    5. Create a derived class called BasketballPlayer that extends Player.
    6. Add a private member variable: pointsScored (type int).
    7. Provide a constructor to initialize all variables.
    8. Implement public method getPointsScored() to access the points scored.
    9. In a main method, create a BasketballPlayer object and display all the details.

     */


    private String name;
    private  String team;

    // constructor
    public Player(String name, String team){
        this.name=name;
        this.team=team;
    }
    //getter
    public String getName(){return name;}
    public String getTeam(){return  team;}

    //Setter
    private void setName(String name){this.name=name;}
    public void  setTeam(String team){this.team=team;}

}


