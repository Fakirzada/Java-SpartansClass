package Assigment.Test5pmClass;

public class swappingString {
    public static void main(String[] args) throws IllegalAccessException {
         String[] arrays={"Apple","Banan","cherry","saeed"};

         swap(arrays,0,2);
        System.out.println("after"+java.util.Arrays.toString(arrays));
    }

  public static void swap(String [] array, int index1, int index2) throws IllegalAccessException {

        if(array==null||index1<0|| index2<0|| index1>= array.length|| index2>= array.length){

            throw  new
                    IllegalAccessException("iVAILD ARREAY ");

        }
        String team=array[index1];
        array[index1]=array[index2];
        array[index2]=team;
    }
}
