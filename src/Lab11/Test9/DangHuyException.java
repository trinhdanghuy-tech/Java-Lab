package Lab11.Test9;

import java.io.Serial;

public class DangHuyException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;


    public DangHuyException(String message){
        super(message);
    }
}
