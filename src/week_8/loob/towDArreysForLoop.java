package week_8.loob;

public class towDArreysForLoop {
    public static void main(String[] args) {

        String [][] name ={
                {"Ali","Kabul","Khan"} ,
                {"Kabul","Mazar","Pulikhumri"},
                {"Iran","Pakisatn","Uzbakistan"}
        };

        for ( int row= 0; row<name.length;row++){

            for ( int clo=0;clo<name.length;clo++){

                System.out.println(name[row][clo]);
            }

        }
        System.out.println();

    }
}
