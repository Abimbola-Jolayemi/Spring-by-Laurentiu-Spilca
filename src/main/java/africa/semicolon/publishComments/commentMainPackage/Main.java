//package africa.semicolon.publishComments.commentMainPackage;
//
//import africa.semicolon.publishComments.source.data.Comment;
//import africa.semicolon.publishComments.source.proxies.EmailCommentNotificationProxy;
//import africa.semicolon.publishComments.source.repositories.CommentRepository;
//import africa.semicolon.publishComments.source.repositories.DBCommentRepository;
//import africa.semicolon.publishComments.source.services.CommentService;
//
//public class Main {
//    public static void main(String[] args) {
//        var commentRepository = new DBCommentRepository();
//        var commentNotificationProxy = new EmailCommentNotificationProxy();
//
////        var commentService = new CommentService(commentRepository, commentNotificationProxy);
//            var commentService = new CommentService();
//        var comment = new Comment();
//        comment.setAuthor("Laurentiu Spilca");
//        comment.setText("Demo Comment");
//
//        commentService.publishComment(comment);
//    }
//}
