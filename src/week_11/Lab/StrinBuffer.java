package week_11.Lab;

public class StrinBuffer {
        static String str = "Hello, Word";
    public StrinBuffer() {
        this.str = getStr();
    }

    public String getStr() {return str;}
    public void setStr(String str) {this.str = str;}

    public static String reveraion(String str) {
        String revorword = "";

        //String[] strSpicl=str.split(" ");

         for (String word: str.split(" ")){
             for ( int index=word.length()-1;index>=0;index--){
                  revorword+=word.charAt(index);
             }
        }
         revorword+=" ";

        return revorword;
    }
    public void print(){

        System.out.println(reveraion(str));
    }


}


