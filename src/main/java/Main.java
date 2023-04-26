import config.AppConfig;
import model.Users;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UsersService;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UsersService users = context.getBean(UsersService.class);
//        users.add(new Users(4,"Vl", (byte) 13));
    }
}