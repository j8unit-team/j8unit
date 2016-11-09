package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.SAXTransformerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SAXTransformerFactory} (by simply
 * reusing the J8Unit test interface {@link SAXTransformerFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class SAXTransformerFactoryTest
implements SAXTransformerFactoryTests<SAXTransformerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.sax.SAXTransformerFactory]

    @Override
    public SAXTransformerFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.sax.SAXTransformerFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.sax.SAXTransformerFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.sax.SAXTransformerFactory]

}
