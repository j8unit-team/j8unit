package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlRootElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlRootElement} (by simply reusing
 * the J8Unit test interface {@link XmlRootElementTests}).
 */

@RunWith(J8Unit4.class)
public class XmlRootElementTest
implements XmlRootElementTests<XmlRootElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlRootElement]

    @Override
    public XmlRootElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlRootElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlRootElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlRootElement]

}
