package africa.semicolon.chapterFive.eagerInstantiation;

import africa.semicolon.chapterFive.lazyInstantiation.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
