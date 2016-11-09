package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlMimeType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlMimeType} (by simply reusing the
 * J8Unit test interface {@link XmlMimeTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlMimeTypeClassTest
implements XmlMimeTypeClassTests<XmlMimeType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlMimeType]

    @Override
    public Class<XmlMimeType> createNewSUT() {
        return XmlMimeType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlMimeType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlMimeType]

}
