package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MidiEvent} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.midi.MidiEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class MidiEventClassTest
implements MidiEventClassTests<MidiEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiEvent]

    @Override
    public Class<MidiEvent> createNewSUT() {
        return MidiEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.MidiEvent#MidiEvent(javax.sound.midi.MidiMessage, long) public
     * javax.sound.midi.MidiEvent(javax.sound.midi.MidiMessage,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_MidiEvent_MidiMessage_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MidiEvent sut = null; // = new MidiEvent(javax.sound.midi.MidiMessage, long);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MidiEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiEvent]

}
