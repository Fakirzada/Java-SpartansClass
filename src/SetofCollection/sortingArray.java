package SetofCollection;

import java.util.Arrays;

public class sortingArray {

    public static void main(String[] args) {
        int [] numbers={1,4,6,8,4,5};
        String []name={"Ali","E","B","F","D"};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

    }
}
