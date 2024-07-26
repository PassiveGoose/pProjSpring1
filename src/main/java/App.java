import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstHWBean = applicationContext.getBean(HelloWorld.class);
        HelloWorld secondHWBean = applicationContext.getBean(HelloWorld.class);

        Cat firstCBean = applicationContext.getBean(Cat.class);
        Cat secondCBean = applicationContext.getBean(Cat.class);

        System.out.println(firstHWBean == secondHWBean);
        System.out.println(firstCBean == secondCBean);
    }
}