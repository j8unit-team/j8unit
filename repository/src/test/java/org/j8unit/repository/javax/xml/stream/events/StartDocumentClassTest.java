package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.StartDocument;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StartDocument} (by simply reusing the
 * J8Unit test interface {@link StartDocumentClassTests}).
 */

@RunWith(J8Unit4.class)
public class StartDocumentClassTest
implements StartDocumentClassTests<StartDocument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.StartDocument]

    @Override
    public Class<StartDocument> createNewSUT() {
        return StartDocument.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.StartDocument]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.StartDocument]

}
