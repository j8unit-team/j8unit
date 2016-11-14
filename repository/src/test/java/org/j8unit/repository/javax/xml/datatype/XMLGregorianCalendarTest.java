package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.XMLGregorianCalendar;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLGregorianCalendar} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.datatype.XMLGregorianCalendarTests}).
 */

@RunWith(J8Unit4.class)
public class XMLGregorianCalendarTest
implements XMLGregorianCalendarTests<XMLGregorianCalendar> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.XMLGregorianCalendar]

    @Override
    public XMLGregorianCalendar createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.datatype.XMLGregorianCalendar], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.XMLGregorianCalendar]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.XMLGregorianCalendar]

}
