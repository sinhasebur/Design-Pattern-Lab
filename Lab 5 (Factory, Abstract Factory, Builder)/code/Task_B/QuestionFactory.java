package Task_B;

public interface QuestionFactory {
    Question createQuestion();

    QuestionRenderer createRenderer();

    QuestionEvaluator createEvaluator();
}
