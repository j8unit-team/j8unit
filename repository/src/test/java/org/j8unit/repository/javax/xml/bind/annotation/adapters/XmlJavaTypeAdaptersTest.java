package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XmlJavaTypeAdapters} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdaptersTests}).
 */
@RunWith(J8Unit4.class)
public class XmlJavaTypeAdaptersTest
implements XmlJavaTypeAdaptersTests<XmlJavaTypeAdapters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters]

    @Override
    public XmlJavaTypeAdapters createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters]

}
