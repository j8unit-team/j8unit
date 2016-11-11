package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlAttribute} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAttributeClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlAttributeClassTest
implements XmlAttributeClassTests<XmlAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlAttribute]

    @Override
    public Class<XmlAttribute> createNewSUT() {
        return XmlAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlAttribute]

}
