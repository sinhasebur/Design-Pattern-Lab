package Task_B;

import Task_D.BankQuestionSource;
import Task_D.QuestionSource;

public class Main {

    public static void main(String[] args) {

        QuestionSource source = new BankQuestionSource();

        QuestionFactory factory = new MCQFactory(source);

        Question question = factory.createQuestion();
        QuestionRenderer renderer = factory.createRenderer();
        QuestionEvaluator evaluator = factory.createEvaluator();

        System.out.println("Question Type: " + question.getType());
        System.out.println("Difficulty: " + question.getDifficulty());
        System.out.println("Points: " + question.getPoints());

        renderer.render(question);

        int score = evaluator.evaluate(question, "A");
        //scoring is right now only for c.
        System.out.println("Score: " + score);
    }
}