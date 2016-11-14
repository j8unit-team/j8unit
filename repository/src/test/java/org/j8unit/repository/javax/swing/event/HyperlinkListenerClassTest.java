package org.j8unit.repository.javax.swing.event;

import javax.swing.event.HyperlinkListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HyperlinkListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.HyperlinkListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class HyperlinkListenerClassTest
implements HyperlinkListenerClassTests<HyperlinkListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.HyperlinkListener]

    @Override
    public Class<HyperlinkListener> createNewSUT() {
        return HyperlinkListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.HyperlinkListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.HyperlinkListener]

}
