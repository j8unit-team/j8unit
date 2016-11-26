package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlInlineBinaryData} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlInlineBinaryDataClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlInlineBinaryDataClassTest
implements XmlInlineBinaryDataClassTests<XmlInlineBinaryData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlInlineBinaryData]

    @Override
    public Class<XmlInlineBinaryData> createNewSUT() {
        return XmlInlineBinaryData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlInlineBinaryData]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlInlineBinaryData]

}
