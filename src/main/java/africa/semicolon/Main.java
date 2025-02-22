package africa.semicolon;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

        Dog dog = context.getBean(Dog.class);
        dog.setName("Dog");
        System.out.println(dog.getName());
        dog.setName("Dog2");
        System.out.println(dog.getName());
    }
}