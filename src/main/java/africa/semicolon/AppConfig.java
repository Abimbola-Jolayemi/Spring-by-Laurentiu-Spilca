package africa.semicolon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "africa.semicolon")
public class AppConfig {

    @Bean
    public Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("Parrot");
        return parrot;
    }
}
