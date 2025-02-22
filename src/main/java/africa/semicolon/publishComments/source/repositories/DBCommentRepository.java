package africa.semicolon.publishComments.source.repositories;

import africa.semicolon.publishComments.source.data.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText() + " by " + comment.getAuthor());
    }
}
