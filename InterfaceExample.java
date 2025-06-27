interface Greeting {
    void sayHello(String name);
}

class EnglishGreeting implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + " ! ");
    }
}

class HindiGreeting implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Namaste, " + name + " ! ");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
 
        Greeting englishGreeting = new EnglishGreeting();
        Greeting hindiGreeting = new HindiGreeting();

    
        englishGreeting.sayHello("Vikas");
        hindiGreeting.sayHello("Vikas");
    }
}