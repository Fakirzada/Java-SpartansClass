package Assigment.Test5pmClass.Countcharacters;

public class MianRun {
    public static void main(String[] args) {


            // Given a String
            String str = "Hello and Welcome To TekSchool! JAVA";
            String strTwo = "Hello JAVA12903809123809123(#*&%(*@#&%#!@&*%(!%123123132";

            // System.out.println( strTwo.replaceAll("[A-Za-z0-9]", "") );

            //
            var characters = new countcharacters(str);
            var numbers = new countcharacters(strTwo);

            // Get count and print uppercase characters
            characters.printUpperCaseCharacters();
            characters.printUpperCaseCharactersUsingForLoop();
            characters.printUpperCaseCharactersUsingInputStream();
            characters.printUpperCaseCharactersSolutionTwo();
            characters.printUpperCaseCharactersUsingForLoopSolutionTwo();
            System.out.println();
            characters.printUpperCaseCharactersUsingInputStreamSolutionTwo();

            // Print digits only
            System.out.println();
            numbers.printDigitsOutOfAString();
            System.out.println();
            numbers.printDigitsUsingInputStream();
            System.out.println();
            numbers.printDigitsUsingForLoop();
        }

}
