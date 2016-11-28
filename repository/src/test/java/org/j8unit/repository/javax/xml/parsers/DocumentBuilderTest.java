package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.DocumentBuilder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocumentBuilder} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.parsers.DocumentBuilderTests}).
 */
@RunWith(J8Unit4.class)
public class DocumentBuilderTest
implements DocumentBuilderTests<DocumentBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.parsers.DocumentBuilder]

    @Override
    public DocumentBuilder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.parsers.DocumentBuilder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.parsers.DocumentBuilder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.parsers.DocumentBuilder]

}
