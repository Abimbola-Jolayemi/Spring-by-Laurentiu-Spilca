package africa.semicolon.publishComments.source.proxies;

import africa.semicolon.publishComments.source.data.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Notification for comment: " + comment.getText() + " by " + comment.getAuthor());
    }
}
