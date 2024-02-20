class ThisDemo{
    static int staticVariable = 10;
    int secondVariable;

    public ThisDemo(int secondVariable) {
        this.secondVariable= secondVariable;
    }

    public void displayVariables() {
        int staticVariable = 5; 

        System.out.println("Second variable using this: " + this.secondVariable);
        System.out.println("Static variable using class name: " + ThisDemo.staticVariable);
        System.out.println("Local variable: " + staticVariable);
    }
}

public class lab5_7{
    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(20);
        obj.displayVariables();
    }
}
