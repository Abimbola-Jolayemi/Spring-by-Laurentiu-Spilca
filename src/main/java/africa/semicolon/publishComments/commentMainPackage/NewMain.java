package africa.semicolon.publishComments.commentMainPackage;

import africa.semicolon.publishComments.configuration.ProjectConfiguration;
import africa.semicolon.publishComments.source.data.Comment;
import africa.semicolon.publishComments.source.proxies.CommentNotificationProxy;
import africa.semicolon.publishComments.source.repositories.CommentRepository;
import africa.semicolon.publishComments.source.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//This is the main class to test my Dependency Injection
public class NewMain {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laureniu Spilca");
        comment.setText("Demo comment using Dependency Injection");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
