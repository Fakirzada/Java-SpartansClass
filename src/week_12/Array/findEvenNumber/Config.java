package week_12.Array.findEvenNumber;

public class Config {

       private int [] numbers={10,30,50,60,1900,2500,1901,25};
       private int evenSum;
       private  int oddSum;
       private  int sumOFOddAndeEVEN;


    public  Config(int [] numbers) {

        setNumbers(numbers);
        setEvenSum(findEvenNumber());
        //this.numbers = numbers;
        //this.evenSum = evenSum;
        //this.oddSum = oddSum;
       // this.sumOFOddAndeEVEN = sumOFOddAndeEVEN;
    }



    public  int[] getNumbers() {return numbers;}
    public  int getEvenSum() {return evenSum;}
    public int getOddSum() {return oddSum;}
    public int getSumOFOddAndeEVEN() {return sumOFOddAndeEVEN;}

    public void setNumbers(int[] numbers) {this.numbers = numbers;}
    public void setEvenSum(int evenSum) {this.evenSum = evenSum;}
    public void setOddSum(int oddSum) {this.oddSum = oddSum;}
    public void setSumOFOddAndeEVEN(int sumOFOddAndeEVEN) {this.sumOFOddAndeEVEN = sumOFOddAndeEVEN;}


    public int findEvenNumber (){
        for (int numer: getNumbers()){
            if (numer%2==0){

            }

        }
        return sumOFOddAndeEVEN;
    }
public void printEenAndOddNumber(){

    System.out.println(getEvenSum());
}

}


