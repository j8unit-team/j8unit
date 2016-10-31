package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlEnum;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlEnumClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlEnumClassTests<XmlEnum> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlEnum]

    @Override
    public Class<XmlEnum> createNewSUT() {
        return XmlEnum.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlEnum]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlEnum]

}
