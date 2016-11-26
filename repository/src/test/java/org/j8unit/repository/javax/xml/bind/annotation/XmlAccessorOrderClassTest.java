package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAccessorOrder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlAccessorOrder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAccessorOrderClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlAccessorOrderClassTest
implements XmlAccessorOrderClassTests<XmlAccessorOrder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlAccessorOrder]

    @Override
    public Class<XmlAccessorOrder> createNewSUT() {
        return XmlAccessorOrder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlAccessorOrder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlAccessorOrder]

}
