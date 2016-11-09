package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.DocumentType;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocumentType} (by simply reusing the
 * J8Unit test interface {@link DocumentTypeTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentTypeTest
implements DocumentTypeTests<DocumentType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.DocumentType]

    @Override
    public DocumentType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.DocumentType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.DocumentType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.DocumentType]

}
