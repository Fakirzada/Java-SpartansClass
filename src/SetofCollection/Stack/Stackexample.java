package SetofCollection.Stack;

import java.util.Stack;

public class Stackexample {

    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();

        //Add value in Stack
        stack.push("kahan");
        stack.push("Bob");
        System.out.println(stack);
        // Remove the Stack  last -in fist our (LIFO)

        stack.pop();
        System.out.println(stack);

        while( !stack.isEmpty()){
            stack.pop();
        }

        System.out.println(stack);

        stack.push("kahan");
        stack.push("Bob");

        System.out.println(stack);





    }
}
