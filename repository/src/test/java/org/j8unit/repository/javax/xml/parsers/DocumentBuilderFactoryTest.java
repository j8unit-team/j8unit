package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.DocumentBuilderFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocumentBuilderFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.parsers.DocumentBuilderFactoryTests}).
 */
@RunWith(J8Unit4.class)
public class DocumentBuilderFactoryTest
implements DocumentBuilderFactoryTests<DocumentBuilderFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.parsers.DocumentBuilderFactory]

    @Override
    public DocumentBuilderFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.parsers.DocumentBuilderFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.parsers.DocumentBuilderFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.parsers.DocumentBuilderFactory]

}
