package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlElementRefs;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlElementRefs} (by simply reusing the
 * J8Unit test interface {@link XmlElementRefsClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlElementRefsClassTest
implements XmlElementRefsClassTests<XmlElementRefs> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlElementRefs]

    @Override
    public Class<XmlElementRefs> createNewSUT() {
        return XmlElementRefs.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlElementRefs]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElementRefs]

}
