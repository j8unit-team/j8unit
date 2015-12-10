package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ControllerEventListenerClassTest
implements org.j8unit.repository.javax.sound.midi.ControllerEventListenerClassTests<javax.sound.midi.ControllerEventListener> {

    @Override
    public Class<javax.sound.midi.ControllerEventListener> createNewSUT() {
        return javax.sound.midi.ControllerEventListener.class;
    }

}
