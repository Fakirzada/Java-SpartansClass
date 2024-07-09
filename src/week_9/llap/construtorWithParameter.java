package week_9.llap;

public class construtorWithParameter {
    int id;
    String [] employInf;
    double salary;
    public construtorWithParameter ( int id, String[] employInf, double salary){
        this.id=id;
        this.employInf=employInf;
        this.salary=salary;
    }
    public void displyEmployInf(){

        for (int inex=0; inex<employInf.length;inex++){
           System.out.println( "ID: "+ 100+ " Employee Info:"+ employInf[inex]+" Saraly: "+200);
        }
       // System.out.println(id);
        //System.out.println(salary);
    }
    public static void main(String[] args) {
       var myobjc= new construtorWithParameter(100,  new String[] {"Ali","jan"}, 200);
       myobjc.displyEmployInf();
    }
}
