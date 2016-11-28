package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.DateTimeSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DateTimeSyntax} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.DateTimeSyntaxClassTests}).
 */
@RunWith(J8Unit4.class)
public class DateTimeSyntaxClassTest
implements DateTimeSyntaxClassTests<DateTimeSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.DateTimeSyntax]

    @Override
    public Class<DateTimeSyntax> createNewSUT() {
        return DateTimeSyntax.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.DateTimeSyntax]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.DateTimeSyntax]

}
