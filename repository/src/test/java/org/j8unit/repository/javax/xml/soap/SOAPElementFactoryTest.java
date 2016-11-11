package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPElementFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPElementFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPElementFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPElementFactoryTest
implements SOAPElementFactoryTests<SOAPElementFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPElementFactory]

    @Override
    public SOAPElementFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.soap.SOAPElementFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.SOAPElementFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.SOAPElementFactory]

}
