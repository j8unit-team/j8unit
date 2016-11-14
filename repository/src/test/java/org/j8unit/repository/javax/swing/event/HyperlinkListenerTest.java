package org.j8unit.repository.javax.swing.event;

import javax.swing.event.HyperlinkListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HyperlinkListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.HyperlinkListenerTests}).
 */

@RunWith(J8Unit4.class)
public class HyperlinkListenerTest
implements HyperlinkListenerTests<HyperlinkListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.HyperlinkListener]

    @Override
    public HyperlinkListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.HyperlinkListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.HyperlinkListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.HyperlinkListener]

}
