package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlAttribute} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAttributeTests}).
 */

@RunWith(J8Unit4.class)
public class XmlAttributeTest
implements XmlAttributeTests<XmlAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlAttribute]

    @Override
    public XmlAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlAttribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlAttribute]

}
