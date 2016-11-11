package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.ControllerEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ControllerEventListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.ControllerEventListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ControllerEventListenerClassTest
implements ControllerEventListenerClassTests<ControllerEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.ControllerEventListener]

    @Override
    public Class<ControllerEventListener> createNewSUT() {
        return ControllerEventListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.ControllerEventListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.ControllerEventListener]

}
