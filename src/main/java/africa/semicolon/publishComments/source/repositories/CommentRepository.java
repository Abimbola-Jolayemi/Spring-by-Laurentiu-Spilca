package africa.semicolon.publishComments.source.repositories;

import africa.semicolon.publishComments.source.data.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
