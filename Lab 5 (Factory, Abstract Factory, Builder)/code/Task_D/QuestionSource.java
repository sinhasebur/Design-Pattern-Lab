package Task_D;

import Task_B.Question;

public interface QuestionSource {
    Question getQuestion(String type);

    String getSourceName();
}
