package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAccessorType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlAccessorType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAccessorTypeClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlAccessorTypeClassTest
implements XmlAccessorTypeClassTests<XmlAccessorType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlAccessorType]

    @Override
    public Class<XmlAccessorType> createNewSUT() {
        return XmlAccessorType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlAccessorType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlAccessorType]

}
