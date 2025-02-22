package africa.semicolon.chapterFive.prototypeBean.firstPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(CommentService.class);

        boolean b1 = cs1 == cs2;
        System.out.println(b1);
    }
}
