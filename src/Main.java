import com.codewithcaleb.exceptions.ExceptionsDemo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            System.out.println("An Unexpected Error Occurred");
        }
    }
}
