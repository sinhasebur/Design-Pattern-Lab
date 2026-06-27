package Task_B;

public class ProgrammingEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        if (answer.contains("java")) {
            return question.getPoints();
        }
        return 0;
    }
}
