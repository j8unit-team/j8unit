package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.traversal.DocumentTraversal;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentTraversal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.traversal.DocumentTraversalClassTests}).
 */
@RunWith(J8Unit4.class)
public class DocumentTraversalClassTest
implements DocumentTraversalClassTests<DocumentTraversal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.traversal.DocumentTraversal]

    @Override
    public Class<DocumentTraversal> createNewSUT() {
        return DocumentTraversal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.traversal.DocumentTraversal]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.traversal.DocumentTraversal]

}
