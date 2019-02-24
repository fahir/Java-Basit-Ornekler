
import java.io.IOException;

public class InvalidAgeException extends IOException {

    public InvalidAgeException(String mesaj) {
        super(mesaj);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu bir Invalid Age hatasıdır. ");
    }

}
