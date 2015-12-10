package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommentClassTest
implements org.j8unit.repository.org.w3c.dom.CommentClassTests<org.w3c.dom.Comment> {

    @Override
    public Class<org.w3c.dom.Comment> createNewSUT() {
        return org.w3c.dom.Comment.class;
    }

}
