package week_11.Lab;

public class StringRevers {
    static String str = "Hello, Word";
    static String revorword = "";
    static String[] words;
    public StringRevers() {

        setStr(str);
        reveraion();
        words=str.split(" ");

    }
    public String getStr() {return str;}
    public void setStr(String str) {this.str = str;}

    public static String reveraion() {

        for (String word: words){
            for ( int index=str.length()-1;index>=0;index--){
                revorword+=word.charAt(index);
            }
        }
        revorword+=" ";
      return  revorword;
    }
    public void print(){
        System.out.println(getStr());
        System.out.println(reveraion());
    }

}
