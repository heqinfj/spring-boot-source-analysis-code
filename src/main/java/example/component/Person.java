package example.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author heqin
 */
@Component
public class Person {
    @Autowired
    Cat cat;
}
