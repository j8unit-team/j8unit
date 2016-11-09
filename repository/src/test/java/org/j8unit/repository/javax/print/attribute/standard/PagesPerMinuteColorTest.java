package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PagesPerMinuteColor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PagesPerMinuteColor} (by simply
 * reusing the J8Unit test interface {@link PagesPerMinuteColorTests}).
 */

@RunWith(J8Unit4.class)
public class PagesPerMinuteColorTest
implements PagesPerMinuteColorTests<PagesPerMinuteColor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PagesPerMinuteColor]

    @Override
    public PagesPerMinuteColor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.PagesPerMinuteColor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.PagesPerMinuteColor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.PagesPerMinuteColor]

}
