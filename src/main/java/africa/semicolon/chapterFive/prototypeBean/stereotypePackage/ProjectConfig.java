package africa.semicolon.chapterFive.prototypeBean.stereotypePackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CommentService.class, CommentRepository.class, UserService.class})
public class ProjectConfig {
}
