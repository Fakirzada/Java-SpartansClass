package AssigmentMay2024.SportPlayer;

public class Basketballpalyer extends Player {
    private  int pointScored;
    public static void main(String[] args) {
        var basketballplayerobj=new Basketballpalyer("Ali Khan","new York",120);
        basketballplayerobj.printbasketBallplayerInfo();
    }
    //constructor
    public Basketballpalyer(String name, String team, int pointScored){
        super(name,team);
        this.pointScored=pointScored;
    }
    //getter
    public int getPointScored(){return pointScored;}
    public void setPointScored(int pointScored){this.pointScored=pointScored;}
    public void printbasketBallplayerInfo(){
        System.out.println("player Name: "+getName() );
        System.out.println("player Team: "+getTeam() );
        System.out.println("player PointScored: "+getPointScored() );

    }

}
