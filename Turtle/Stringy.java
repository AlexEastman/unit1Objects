

/**
 * 
 * Alex Eastman, Other 
 * 0.0
 */
public class Stringy
{
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox ";
        String animal2 = "lazy dog ";
        String article = "the ";
        String action = "jumps over ";
        String message = article; 
        message = message + animal1;
        message = message +action;
        message = message + article;
        message = message +animal2;
        System.out.println(message);
    }
}
