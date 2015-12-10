package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommentClassTest
implements org.j8unit.repository.javax.xml.stream.events.CommentClassTests<javax.xml.stream.events.Comment> {

    @Override
    public Class<javax.xml.stream.events.Comment> createNewSUT() {
        return javax.xml.stream.events.Comment.class;
    }

}
