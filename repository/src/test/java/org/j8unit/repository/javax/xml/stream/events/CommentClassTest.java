package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.Comment;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Comment} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.stream.events.CommentClassTests}).
 */

@RunWith(J8Unit4.class)
public class CommentClassTest
implements CommentClassTests<Comment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.Comment]

    @Override
    public Class<Comment> createNewSUT() {
        return Comment.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.Comment]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.Comment]

}
