package Assigment.Test5pmClass;

public class IsPulanger {

    private String str;

    public IsPulanger(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static  boolean isPulanger(String str){

        String rever="";
        for (int i =str.length()-1;i>=0;i--){
          rever+=str.charAt(i);
        }

        return str.equals(rever);

    }

    public void print(){
        System.out.println(isPulanger(str));
    }
}
