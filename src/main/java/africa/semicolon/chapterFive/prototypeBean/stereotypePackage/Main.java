package africa.semicolon.chapterFive.prototypeBean.stereotypePackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);
//        var s2 = context.getBean(CommentService.class);

        System.out.println(s1.getCommentRepository());
        System.out.println(s2.getCommentRepository());

        boolean b1 = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b1);
//        System.out.println("The S1 class is: " + s1.getClass());
    }
}
