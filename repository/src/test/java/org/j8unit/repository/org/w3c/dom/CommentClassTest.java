package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Comment;

@RunWith(J8Unit4.class)
public class CommentClassTest
implements org.j8unit.repository.org.w3c.dom.CommentClassTests<Comment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Comment]

    @Override
    public Class<Comment> createNewSUT() {
        return Comment.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Comment]

}
