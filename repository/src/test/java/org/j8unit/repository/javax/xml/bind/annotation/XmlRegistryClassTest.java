package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlRegistry;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlRegistry} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlRegistryClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlRegistryClassTest
implements XmlRegistryClassTests<XmlRegistry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlRegistry]

    @Override
    public Class<XmlRegistry> createNewSUT() {
        return XmlRegistry.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlRegistry]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlRegistry]

}
