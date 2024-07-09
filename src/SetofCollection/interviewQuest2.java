package SetofCollection;

import java.util.HashMap;

public class interviewQuest2 {
    public static void main(String[] args) {

    String str="KKKhhhfddsfhsdfslfsdjfhdjshfsdjhfsdhf";

    HashMap<Character,Integer> mapOfCharaters=new HashMap<>();
    for( char charater: str.toCharArray())
        mapOfCharaters.merge(charater, 1, Integer::sum);
        mapOfCharaters.forEach((character, count)-> System.out.println(character+" - "+ count));

}
}