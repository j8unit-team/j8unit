package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

@RunWith(J8Unit4.class)
public class DocumentTest
implements org.j8unit.repository.org.w3c.dom.DocumentTests<Document> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.Document]

    @Override
    public Document createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.Document], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.Document]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.Document]

}
