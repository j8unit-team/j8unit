package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MetaEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MetaEventListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.MetaEventListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class MetaEventListenerClassTest
implements MetaEventListenerClassTests<MetaEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MetaEventListener]

    @Override
    public Class<MetaEventListener> createNewSUT() {
        return MetaEventListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MetaEventListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MetaEventListener]

}
