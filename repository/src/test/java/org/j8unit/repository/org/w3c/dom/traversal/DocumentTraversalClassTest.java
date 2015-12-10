package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentTraversalClassTest
implements org.j8unit.repository.org.w3c.dom.traversal.DocumentTraversalClassTests<org.w3c.dom.traversal.DocumentTraversal> {

    @Override
    public Class<org.w3c.dom.traversal.DocumentTraversal> createNewSUT() {
        return org.w3c.dom.traversal.DocumentTraversal.class;
    }

}
