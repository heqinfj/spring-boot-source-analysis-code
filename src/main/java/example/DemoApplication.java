package example;

import example.transaction.service.DemoService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author heqin
 */
@EnableTransactionManagement
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        DemoService2 demoService2 = ctx.getBean(DemoService2.class);
        demoService2.test2();
    }
}
