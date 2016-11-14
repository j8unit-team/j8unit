package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlIDREF;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlIDREF} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlIDREFClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlIDREFClassTest
implements XmlIDREFClassTests<XmlIDREF> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlIDREF]

    @Override
    public Class<XmlIDREF> createNewSUT() {
        return XmlIDREF.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlIDREF]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlIDREF]

}
