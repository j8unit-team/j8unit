package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Media;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Media} (by simply reusing the J8Unit
 * test interface {@link MediaTests}).
 */

@RunWith(J8Unit4.class)
public class MediaTest
implements MediaTests<Media> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Media]

    @Override
    public Media createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.standard.Media], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.Media]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.Media]

}
