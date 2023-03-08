package server.exception;

public class InvalidAccessException extends RuntimeException{

    public InvalidAccessException(String message){
        super(message);
    }

    public InvalidAccessException(String message,Throwable couse){
        super(message,couse);
    }
}
