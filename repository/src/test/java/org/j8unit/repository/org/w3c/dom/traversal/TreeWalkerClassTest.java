package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeWalkerClassTest
implements org.j8unit.repository.org.w3c.dom.traversal.TreeWalkerClassTests<org.w3c.dom.traversal.TreeWalker> {

    @Override
    public Class<org.w3c.dom.traversal.TreeWalker> createNewSUT() {
        return org.w3c.dom.traversal.TreeWalker.class;
    }

}
