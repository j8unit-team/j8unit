package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlTransient;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlTransient} (by simply reusing the
 * J8Unit test interface {@link XmlTransientTests}).
 */

@RunWith(J8Unit4.class)
public class XmlTransientTest
implements XmlTransientTests<XmlTransient> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlTransient]

    @Override
    public XmlTransient createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlTransient], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlTransient]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlTransient]

}
