package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlEnum;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlEnum} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlEnumClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlEnumClassTest
implements XmlEnumClassTests<XmlEnum> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlEnum]

    @Override
    public Class<XmlEnum> createNewSUT() {
        return XmlEnum.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlEnum]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlEnum]

}
