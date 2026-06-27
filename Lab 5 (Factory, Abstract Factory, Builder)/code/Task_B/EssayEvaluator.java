package Task_B;

public class EssayEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        if (answer.length() >= 500) {
            return question.getPoints();
        }
        System.out.println("Answer too short");
        return 0;
    }
}
