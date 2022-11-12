package ba.unsa.etf.rpr;

public class NotInMapException extends Exception{

    private String message;
    public NotInMapException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }

}
