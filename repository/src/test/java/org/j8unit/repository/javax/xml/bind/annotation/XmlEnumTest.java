package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlEnum;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlEnumTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlEnumTests<XmlEnum> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlEnum]

    @Override
    public XmlEnum createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlEnum], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlEnum]

}
