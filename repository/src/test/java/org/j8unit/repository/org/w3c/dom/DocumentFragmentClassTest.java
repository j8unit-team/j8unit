package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DocumentFragment;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentFragment} (by simply reusing the
 * J8Unit test interface {@link DocumentFragmentClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentFragmentClassTest
implements DocumentFragmentClassTests<DocumentFragment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DocumentFragment]

    @Override
    public Class<DocumentFragment> createNewSUT() {
        return DocumentFragment.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DocumentFragment]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DocumentFragment]

}
