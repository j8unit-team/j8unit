package org.j8unit.repository.java.awt.event;

import java.awt.event.TextListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.TextListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class TextListenerClassTest
implements TextListenerClassTests<TextListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.TextListener]

    @Override
    public Class<TextListener> createNewSUT() {
        return TextListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.TextListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.TextListener]

}
