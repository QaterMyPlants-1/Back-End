package Exceptions;

public class ResourceNotFoundException  extends RuntimeException{

    public ResourceNotFoundException(String message)
    {
        super("An Error Happened " + message);
    }
}
