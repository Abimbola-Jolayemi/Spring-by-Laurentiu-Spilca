package africa.semicolon.chapterFive.singletonStereotype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CommentRepository.class, CommentService.class, UserService.class})
public class ProjectConfig {

}
