package whowantstobeamillioner;

public final class Settings 
{
    //Темы
    public enum Topic
    {
        HISTORY,
        GEOGRAPHY,
        MATH,
        LANGUAGES
    }
    
    //Классы тем и сложности
    private Topic topic;
    private int difficulty;
    
    //Получить тему
    public Topic getTopic() 
    {
        return topic;
    }
    
    //Выставление темы
    public void setTopic(Topic topic) 
    {
        this.topic = topic;
    }
    
    //Получить сложность
    public int getDifficulty() 
    {
        return difficulty;
    }
    
    //Выставить сложность
    public void setDifficulty(int difficulty) 
    {
        this.difficulty = difficulty;
    }
    
    //Конструктор
    public Settings(int difficulty, Topic topic) 
    {
        this.setDifficulty(difficulty);
        this.setTopic(topic);
    }
}