import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Quiz quiz = new Quiz("C:\\Users\\HP Elitebook\\Desktop\\projektyJAVA\\quizJavaBasics\\src\\main\\resources\\quiz.json");
        quiz.play();
    }
}
