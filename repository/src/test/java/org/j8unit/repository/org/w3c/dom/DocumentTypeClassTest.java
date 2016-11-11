package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DocumentType;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.DocumentTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentTypeClassTest
implements DocumentTypeClassTests<DocumentType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DocumentType]

    @Override
    public Class<DocumentType> createNewSUT() {
        return DocumentType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DocumentType]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DocumentType]

}
