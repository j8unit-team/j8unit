package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlMixed;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlMixed} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlMixedClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlMixedClassTest
implements XmlMixedClassTests<XmlMixed> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlMixed]

    @Override
    public Class<XmlMixed> createNewSUT() {
        return XmlMixed.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlMixed]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlMixed]

}
