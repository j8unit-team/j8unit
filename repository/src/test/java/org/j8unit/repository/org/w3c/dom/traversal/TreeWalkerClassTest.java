package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.traversal.TreeWalker;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeWalker} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.traversal.TreeWalkerClassTests}).
 */
@RunWith(J8Unit4.class)
public class TreeWalkerClassTest
implements TreeWalkerClassTests<TreeWalker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.traversal.TreeWalker]

    @Override
    public Class<TreeWalker> createNewSUT() {
        return TreeWalker.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.traversal.TreeWalker]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.traversal.TreeWalker]

}
