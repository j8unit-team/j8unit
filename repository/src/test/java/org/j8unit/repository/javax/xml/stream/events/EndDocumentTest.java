package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.EndDocument;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EndDocument} (by simply reusing the
 * J8Unit test interface {@link EndDocumentTests}).
 */

@RunWith(J8Unit4.class)
public class EndDocumentTest
implements EndDocumentTests<EndDocument> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.events.EndDocument]

    @Override
    public EndDocument createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.events.EndDocument], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.events.EndDocument]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.events.EndDocument]

}
