package week_9.llap.QuxGame;

import Assigment.StringsindexO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guiz {

    //varibale
    private List<Question> questions;
    private int correctAnswer;
    private  int inCorrectAnswer;

    public  Guiz(){
        setQuestions(new ArrayList<>());
        setCorrectAnswer(0);
        setIncrrectAnswer(0);
        loadQuestions();


    }
    private void setQuestions(List<Question> questions) {this.questions=questions;}
    private void setCorrectAnswer(int i) {this.correctAnswer=correctAnswer;}
    private void setIncrrectAnswer(int i) {this.inCorrectAnswer=inCorrectAnswer;}
    private void loadQuestions() {
        questions.add(new Question("What is the capital of France?", new String[]{"1. Berlin", "2. Madrid",  "3. Paris",  "4. Rome"}, 3));
        questions.add(new Question("Which planet is known as the Red Planet?",new String[]{"1. Earth",  "2. Mars",  "3. Jupiter",  "4. Venus"}, 3));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?", new String[]{"1. William Shakespeare",  "2. Charles Dickens",  "3. Mark Twain",  "4. Jane Austen"}, 1));
        questions.add(new Question("What is the largest ocean on Earth?", new String[]{"1. Atlantic Ocean",  "2. Indian Ocean",  " 3. Arctic Ocean",  "4. Pacific Ocean"}, 4));
        questions.add(new Question("What is the chemical symbol for water?", new String[]{"1. H2O",  "2. CO2",  "3. O2",  "4. NaCl"}, 1));
        questions.add(new Question("What is the default value of String", new String[]{"1. null", "2. 0", "3. Empty String", "4. Error"}, 1));
    }

    private  void  displayQuestion(Question question){

        System.out.println(question.getQuestionText());
         for( String choice: question.getChoices()){
             System.out.println(choice);

         }
    }

    private int userInput (Scanner scanner){
        System.out.println("Your Answer (1-4)");
        return  scanner.nextInt();
    }

    private void dispalyResult(){

        int totalQuestions= questions.size();
        int score= (correctAnswer*100)/totalQuestions;
        System.out.println("Quize is Over!");
        System.out.println("Correct Answer: "+ correctAnswer);
        System.out.println("Incrrect Answer: "+inCorrectAnswer);
        System.out.println("Score: "+ score+ "%");
    }

    // method to Start the game
    public void startQuiz(){

        var scanner=new Scanner(System.in);
        for ( Question question:questions){

            displayQuestion(question);
            int userAnswer=userInput(scanner);
            if (question.isCorrect(userAnswer)) {
                correctAnswer++;
            } else {
                inCorrectAnswer++;
            }

        }
        dispalyResult();
        scanner.close();
    }






}
