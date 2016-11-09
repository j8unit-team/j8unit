package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlValue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlValue} (by simply reusing the
 * J8Unit test interface {@link XmlValueTests}).
 */

@RunWith(J8Unit4.class)
public class XmlValueTest
implements XmlValueTests<XmlValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlValue]

    @Override
    public XmlValue createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlValue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlValue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlValue]

}
