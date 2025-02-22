package africa.semicolon.publishComments.source.proxies;

import africa.semicolon.publishComments.source.data.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
