package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new MultiChoice("Capital of France?", 2,
                "London", "Paris", "Berlin", "Madrid", "B"));
        questions.add(new TrueOrFalse("Java is a programming language.", 1, true));

        int score = 0;

        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Your answer: ");
            String ans = scan.nextLine();

            if (q.checkAnswer(ans)) {
                score += q.marks;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("Final Score: " + score);
    }
}
class Question{
    protected String question;
    protected int marks;

    public Question(String question, int marks){
        this.question = question;
        this.marks = marks;
    }

    public void displayQuestion(){
        System.out.println(question);
    }

    public boolean checkAnswer(String userAnswer){
        return false;
    }
}
class MultiChoice extends Question{
    private final String optionA, optionB, optionC, optionD;
    private final String correctAnswer;

    public MultiChoice(String question, int marks, String optionA, String optionB, String optionC, String optionD, String correctAnswer){
        super(question, marks);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}
class TrueOrFalse extends Question{
    private final boolean correct;
    
    public TrueOrFalse(String question, int marks, boolean correct){
        super(question, marks);
        this.correct = correct;
    }

    @Override
    public void displayQuestion() {
        System.out.println(question + " True/False");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        boolean b = userAnswer.equalsIgnoreCase("true");
        return b == correct;
    }
}
