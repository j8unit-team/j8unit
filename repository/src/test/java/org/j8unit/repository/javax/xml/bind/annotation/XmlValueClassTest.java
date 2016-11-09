package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlValue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlValue} (by simply reusing the J8Unit
 * test interface {@link XmlValueClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlValueClassTest
implements XmlValueClassTests<XmlValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlValue]

    @Override
    public Class<XmlValue> createNewSUT() {
        return XmlValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlValue]

}
