package africa.semicolon.publishComments.configuration;

import africa.semicolon.publishComments.source.data.Comment;
import africa.semicolon.publishComments.source.proxies.CommentNotificationProxy;
import africa.semicolon.publishComments.source.proxies.EmailCommentNotificationProxy;
import africa.semicolon.publishComments.source.repositories.CommentRepository;
import africa.semicolon.publishComments.source.repositories.DBCommentRepository;
import africa.semicolon.publishComments.source.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        //using basePackageClasses instead of basePackage
        basePackageClasses =
                {EmailCommentNotificationProxy.class,
                        CommentService.class,
                        DBCommentRepository.class})
public class ProjectConfiguration {

    //If I want to use the @Bean annotation instead of the Stereotype annotation
//    @Bean
//    public CommentRepository commentRepository(){
//        return new DBCommentRepository();
//    }
//
//    @Bean
//    public CommentNotificationProxy commentNotificationProxy(){
//        return new EmailCommentNotificationProxy();
//    }
//
//    @Bean
//    public CommentService commentService(CommentRepository commentRepository,
//                                         CommentNotificationProxy commentNotificationProxy){
//        return new CommentService(commentRepository, commentNotificationProxy);
//    }
}
