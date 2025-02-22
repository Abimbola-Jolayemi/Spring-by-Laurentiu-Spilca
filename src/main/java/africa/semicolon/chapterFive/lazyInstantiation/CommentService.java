package africa.semicolon.chapterFive.lazyInstantiation;

import africa.semicolon.publishComments.source.data.Comment;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {

    public CommentService(){
        System.out.println("Comment service instance created");
    }
}
