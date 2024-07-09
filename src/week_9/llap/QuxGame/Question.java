package week_9.llap.QuxGame;

public class Question {


    // variables
    String questionText;
    String[] choices;
    int correctAnswer;
  // constructor
    public Question(String questionText,String[] choices, int correctAnswer){

        setQuestionText(questionText);
        setChoices(choices);
        setCorrectAnswer(correctAnswer);
    }
    // private method || setters
    private void setCorrectAnswer(int correctAnswer) {this.questionText=questionText;}
    private void setChoices(String[] choices) {this.choices=choices;}
    private void setQuestionText(String questionText) {this.correctAnswer=correctAnswer;}

    // public Method || Getters
    public String getQuestionText(){return questionText;}
    public String[]getChoices(){return choices;}
    public int getCorrectAnswer(){return correctAnswer;}
    public  boolean isCorrect(int userAnswer){return userAnswer== correctAnswer;}

}
