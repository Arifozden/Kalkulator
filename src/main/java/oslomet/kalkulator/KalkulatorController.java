package oslomet.kalkulator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KalkulatorController {
    @GetMapping("/add")
    public String add(String felt1,String felt2){
        try {
            double a=Double.parseDouble(felt1);
            double b=Double.parseDouble(felt2);
            return Double.toString(a+b);
        }
        catch (Exception e){
            return "Error";
        }
    }

    @GetMapping("/subtract")
    public String subtract(String felt1,String felt2){
        try {
            double a=Double.parseDouble(felt1);
            double b=Double.parseDouble(felt2);
            return Double.toString(a+b);
        }
        catch (Exception e){
            return "Error";
        }
    }

    @GetMapping("/multiply")
    public String multiply(String felt1,String felt2){
        try {
            double a=Double.parseDouble(felt1);
            double b=Double.parseDouble(felt2);
            return Double.toString(a+b);
        }
        catch (Exception e){
            return "Error";
        }
    }

    @GetMapping("/divide")
    public String divide(String felt1,String felt2){
        try {
            double a=Double.parseDouble(felt1);
            double b=Double.parseDouble(felt2);
            return Double.toString(a+b);
        }
        catch (Exception e){
            return "Error";
        }
    }
}
