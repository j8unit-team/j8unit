package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlJavaTypeAdapters} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdaptersClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlJavaTypeAdaptersClassTest
implements XmlJavaTypeAdaptersClassTests<XmlJavaTypeAdapters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters]

    @Override
    public Class<XmlJavaTypeAdapters> createNewSUT() {
        return XmlJavaTypeAdapters.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters]

}
