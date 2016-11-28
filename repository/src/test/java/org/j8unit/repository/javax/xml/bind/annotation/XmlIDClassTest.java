package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlID;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlID} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlIDClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlIDClassTest
implements XmlIDClassTests<XmlID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlID]

    @Override
    public Class<XmlID> createNewSUT() {
        return XmlID.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlID]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlID]

}
