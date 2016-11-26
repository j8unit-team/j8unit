package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Receiver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Receiver} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.midi.ReceiverClassTests}).
 */
@RunWith(J8Unit4.class)
public class ReceiverClassTest
implements ReceiverClassTests<Receiver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Receiver]

    @Override
    public Class<Receiver> createNewSUT() {
        return Receiver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.Receiver]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Receiver]

}
