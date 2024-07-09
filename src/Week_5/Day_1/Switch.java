package Week_5.Day_1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        Scanner mysacanner= new Scanner(System.in);
        System.out.println("Enter you case umber");
        int instrument= mysacanner.nextInt();
        String musicInstrument ="Guitgr";

        switch (instrument){

            case 1:
                musicInstrument="Guitgr";
                break;
            case 2:
                musicInstrument="Piyano";
                break;
            case 3:
                musicInstrument="Drums";
                break;
            case 4:
                musicInstrument="Fulte";
                break;

            default:
                musicInstrument="Invalid";
        }
        System.out.println(musicInstrument);

    }
}
