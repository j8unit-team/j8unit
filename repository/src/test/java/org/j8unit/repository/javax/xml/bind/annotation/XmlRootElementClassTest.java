package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlRootElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlRootElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlRootElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlRootElementClassTest
implements XmlRootElementClassTests<XmlRootElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlRootElement]

    @Override
    public Class<XmlRootElement> createNewSUT() {
        return XmlRootElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlRootElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlRootElement]

}
