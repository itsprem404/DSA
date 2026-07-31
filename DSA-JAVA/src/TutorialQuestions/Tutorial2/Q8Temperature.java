package TutorialQuestions.Tutorial2;

class Temperature {
    double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public void convertAndDisplay() {
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Celsius: " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
    }
}

public class Q8Temperature {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25.5);
        temp.convertAndDisplay();
    }
}