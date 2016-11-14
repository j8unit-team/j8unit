package org.j8unit.repository.java.applet;

import java.applet.AudioClip;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AudioClip} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.applet.AudioClipClassTests}).
 */

@RunWith(J8Unit4.class)
public class AudioClipClassTest
implements AudioClipClassTests<AudioClip> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.applet.AudioClip]

    @Override
    public Class<AudioClip> createNewSUT() {
        return AudioClip.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.applet.AudioClip]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.applet.AudioClip]

}
