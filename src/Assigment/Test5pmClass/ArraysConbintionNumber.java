package Assigment.Test5pmClass;

public class ArraysConbintionNumber {

    private int min;
    private int max;
    private int range;
    private int arraysize;
    private int[] arr;
    private int countarry;

    public ArraysConbintionNumber( int min,int max){
       // this.min = min;
       // this.max = max;
        setCountarry(0);
        setMax(max);
        setMin(min);
        setRange(max - min + 1);
        setArraysize(getRange() * getRange() * getRange() * getRange());
        setArr(new int[arraysize]);
       generateArrays();
    }

    public int getMin() {return min;}

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getArraysize() {
        return arraysize;
    }

    public void setArraysize(int arraysize) {
        this.arraysize = arraysize;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getCountarry() {
        return countarry;
    }

    public void setCountarry(int countarry) {
        this.countarry = countarry;
    }

    private int[] generateArrays() {

        for (int i = getMin(); i <= getMax(); i++) {
            for (int j = getMin(); j <= getMax(); j++) {
                for (int k = getMin(); k <= getMax(); k++) {
                    for (int f = getMin(); f <= getMax(); f++) {
                        getArr()[getCountarry()] = i * 1000 + j * 100 + k * 10 + f;
                        setCountarry(+1);
                    }
                }
            }
        }
        return getArr();
    }

    public void printArray(){
        for (int num:getArr()){
            System.out.print(num+" ");
        }
    }

    public void printTheNumberOfCobination(){
        System.out.println("THEN NUMBER "+getCountarry());
    }
}