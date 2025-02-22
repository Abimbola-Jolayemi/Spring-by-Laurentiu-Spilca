package africa.semicolon.publishComments.source.services;

import africa.semicolon.publishComments.source.data.Comment;
import africa.semicolon.publishComments.source.proxies.CommentNotificationProxy;
import africa.semicolon.publishComments.source.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

//    @Autowired
//    private CommentRepository commentRepository;
//
//    @Autowired
//    private CommentNotificationProxy commentNotificationProxy;


    //Removed the contructor and added the @Autowired annotation to the fields, not making them final also
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
