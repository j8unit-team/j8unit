package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlElementWrapper;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlElementWrapper} (by simply reusing the
 * J8Unit test interface {@link XmlElementWrapperClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlElementWrapperClassTest
implements XmlElementWrapperClassTests<XmlElementWrapper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlElementWrapper]

    @Override
    public Class<XmlElementWrapper> createNewSUT() {
        return XmlElementWrapper.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlElementWrapper]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElementWrapper]

}
