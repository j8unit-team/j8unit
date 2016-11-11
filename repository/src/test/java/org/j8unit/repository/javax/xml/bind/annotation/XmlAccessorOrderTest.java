package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAccessorOrder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlAccessorOrder} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAccessorOrderTests}).
 */

@RunWith(J8Unit4.class)
public class XmlAccessorOrderTest
implements XmlAccessorOrderTests<XmlAccessorOrder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlAccessorOrder]

    @Override
    public XmlAccessorOrder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlAccessorOrder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlAccessorOrder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlAccessorOrder]

}
