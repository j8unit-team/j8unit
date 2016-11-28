package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.EndDocument;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EndDocument} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.EndDocumentClassTests}).
 */
@RunWith(J8Unit4.class)
public class EndDocumentClassTest
implements EndDocumentClassTests<EndDocument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.EndDocument]

    @Override
    public Class<EndDocument> createNewSUT() {
        return EndDocument.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.EndDocument]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.EndDocument]

}
