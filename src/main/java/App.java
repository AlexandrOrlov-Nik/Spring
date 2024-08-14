import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        Cat bean4 =
                (Cat) applicationContext.getBean("cat");


        System.out.println("Are HelloWorld beans equal? " + (bean == beanTwo)); // Ожидается true
        System.out.println("Are Cat beans equal? " + (bean3 == bean4));

    }
}