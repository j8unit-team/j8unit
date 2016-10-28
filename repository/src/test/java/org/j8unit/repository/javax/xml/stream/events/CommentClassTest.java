package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.Comment;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommentClassTest
implements org.j8unit.repository.javax.xml.stream.events.CommentClassTests<Comment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.Comment]

    @Override
    public Class<Comment> createNewSUT() {
        return Comment.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.Comment]

}
