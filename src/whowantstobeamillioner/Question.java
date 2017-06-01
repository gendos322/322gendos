package whowantstobeamillioner;

import java.util.ArrayList;

public class Question 
{
    //Классы вопроса и ответа
    private String question;
    private ArrayList<String> answers;

    //Получить ответы
    public ArrayList getAnswers() 
    {
        return answers;
    }
    
    //Выставить ответы
    public void setAnswers(ArrayList answers) 
    {
        this.answers = answers;
    }
    
    //Получить вопрос
    public String getQuestion() 
    {
        return question;
    }
    
    //Выстваить вопрос
    public void setQuestion(String question) 
    {
        this.question = question;
    }
    
    //Конструктор
    public Question(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }
}
