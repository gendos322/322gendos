package whowantstobeamillioner;

import java.util.ArrayList;
import java.util.Random;

public class Game 
{   
    //Классы базы данных и настройки
    private Database database;
    private Settings settings;
    
    public void initGame()
    {
        //Создаем классы настроек базы данных
        settings = new Settings(1, Settings.Topic.HISTORY);
        database = new Database();
        
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Yes");
        list.add("Probably");
        list.add("Hmmm");
        list.add("No");
        
        Question question = new Question("Do you want to be a millioner?", list);
        
        database.addQuestion(question);
    }
    
    //Генератор вопросов
    public void generateQuestion()
    {
        int numberOfQuestions = database.getNumberOfQuestions();
        
        Random r = new Random();
        int index = r.nextInt() % numberOfQuestions;
        
        Question question = database.getQuestionByIndex(index);
    }
    
    static void main()
    {
        Game game = new Game();
        game.initGame();
    } 
}
