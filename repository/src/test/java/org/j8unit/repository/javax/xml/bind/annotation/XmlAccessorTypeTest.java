package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAccessorType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlAccessorType} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAccessorTypeTests}).
 */
@RunWith(J8Unit4.class)
public class XmlAccessorTypeTest
implements XmlAccessorTypeTests<XmlAccessorType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlAccessorType]

    @Override
    public XmlAccessorType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlAccessorType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlAccessorType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlAccessorType]

}
