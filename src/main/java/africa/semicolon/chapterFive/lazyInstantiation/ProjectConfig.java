package africa.semicolon.chapterFive.lazyInstantiation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CommentService.class)
public class ProjectConfig {
}
