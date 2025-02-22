package africa.semicolon.chapterFive.eagerInstantiation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    public CommentService(){
        System.out.println("Comment Service instance created");
    }
}
