package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MetaEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetaEventListenerClassTest
implements org.j8unit.repository.javax.sound.midi.MetaEventListenerClassTests<MetaEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MetaEventListener]

    @Override
    public Class<MetaEventListener> createNewSUT() {
        return MetaEventListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MetaEventListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MetaEventListener]

}
