package africa.semicolon.chapterFive.lazyInstantiation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the comment service");
        var service = context.getBean(CommentService.class);
        System.out.println("After retrieving the comment service");
    }
}
