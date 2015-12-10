package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetaEventListenerClassTest
implements org.j8unit.repository.javax.sound.midi.MetaEventListenerClassTests<javax.sound.midi.MetaEventListener> {

    @Override
    public Class<javax.sound.midi.MetaEventListener> createNewSUT() {
        return javax.sound.midi.MetaEventListener.class;
    }

}
