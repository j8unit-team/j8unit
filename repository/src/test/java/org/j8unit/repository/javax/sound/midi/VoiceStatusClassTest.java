package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.VoiceStatus;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VoiceStatusClassTest
implements org.j8unit.repository.javax.sound.midi.VoiceStatusClassTests<VoiceStatus> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.VoiceStatus]

    @Override
    public Class<VoiceStatus> createNewSUT() {
        return VoiceStatus.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.sound.midi.VoiceStatus#VoiceStatus()
     * public javax.sound.midi.VoiceStatus()}.
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
    public void create_VoiceStatus()
    throws Exception {
        // create new instance
        final VoiceStatus sut = new VoiceStatus();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.VoiceStatus]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.VoiceStatus]

}
