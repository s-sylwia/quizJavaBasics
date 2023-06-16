import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class QuizTest {

    @Test
    void displayQuestionsTest() {
        Quiz quiz = new Quiz("C:\\Users\\HP Elitebook\\Desktop\\projektyJAVA\\quizJavaBasics\\src\\main\\resources\\quiz.json");
        assertDoesNotThrow(() -> quiz.displayQuestions());
    }

    @Test
    void playTest() {
        Quiz quiz = new Quiz("C:\\Users\\HP Elitebook\\Desktop\\projektyJAVA\\quizJavaBasics\\src\\main\\resources\\quiz.json");
        assertDoesNotThrow(() -> quiz.play());
    }

}