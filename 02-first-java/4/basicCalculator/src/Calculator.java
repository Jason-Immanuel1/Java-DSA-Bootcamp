import java.util.Objects;

public class Calculator {
    public float calculate(float a, float b, String c) {
        if (Objects.equals(c, "+")){
            return a + b;
        }
        else if (Objects.equals(c, "-")){
            return a - b;
        }
        else if (Objects.equals(c, "*")){
            return a * b;
        }
        else if (Objects.equals(c, "/")){
            return a / b;
        }
        return 0;
    }
}
