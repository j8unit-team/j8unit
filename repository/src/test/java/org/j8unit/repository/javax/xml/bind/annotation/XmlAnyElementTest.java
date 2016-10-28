package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAnyElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAnyElementTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAnyElementTests<XmlAnyElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlAnyElement]

    @Override
    public XmlAnyElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlAnyElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlAnyElement]

}
