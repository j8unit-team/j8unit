package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlEnumValue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlEnumValueTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlEnumValueTests<XmlEnumValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlEnumValue]

    @Override
    public XmlEnumValue createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlEnumValue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlEnumValue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlEnumValue]

}
