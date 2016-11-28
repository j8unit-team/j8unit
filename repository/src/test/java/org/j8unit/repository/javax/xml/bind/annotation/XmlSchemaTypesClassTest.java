package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlSchemaTypes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlSchemaTypes} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaTypesClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlSchemaTypesClassTest
implements XmlSchemaTypesClassTests<XmlSchemaTypes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlSchemaTypes]

    @Override
    public Class<XmlSchemaTypes> createNewSUT() {
        return XmlSchemaTypes.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlSchemaTypes]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlSchemaTypes]

}
