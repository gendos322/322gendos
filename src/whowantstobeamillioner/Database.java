package whowantstobeamillioner;

import java.util.ArrayList;

public class Database 
{
    //Список вопрос и текущий вопрос
    int index; 
    ArrayList<Question> questions = new ArrayList<>();
    
    //Добавить вопрос 
    public int addQuestion(Question question)
    {
        questions.add(index, question);
        return index++;
    }
    
    //Удалить вопрос
    public void deleteQuestion(int index)
    {
        questions.remove(index);
    }
    
    //Получить количество вопросов
    public int getNumberOfQuestions()
    {
        return questions.size();
    }

    //Получить вопрос по индексу
    public Question getQuestionByIndex(int index)
    {
        return questions.get(index);
    }
    
    //Конструктор
    public Database() 
    {
        this.index = 0;
    }
}

