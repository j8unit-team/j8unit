package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.LineListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LineListener} (by simply reusing the
 * J8Unit test interface {@link LineListenerTests}).
 */

@RunWith(J8Unit4.class)
public class LineListenerTest
implements LineListenerTests<LineListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.LineListener]

    @Override
    public LineListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.LineListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.LineListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.LineListener]

}
