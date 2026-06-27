package Task_B;

public class MCQEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        if (answer.equalsIgnoreCase("C")) {
            return question.getPoints();
        }
        return 0;
    }
}
