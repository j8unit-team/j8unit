package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlMixed;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlMixed} (by simply reusing the
 * J8Unit test interface {@link XmlMixedTests}).
 */

@RunWith(J8Unit4.class)
public class XmlMixedTest
implements XmlMixedTests<XmlMixed> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlMixed]

    @Override
    public XmlMixed createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlMixed], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlMixed]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlMixed]

}
