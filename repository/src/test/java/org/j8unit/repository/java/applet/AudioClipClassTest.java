package org.j8unit.repository.java.applet;

import java.applet.AudioClip;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioClipClassTest
implements org.j8unit.repository.java.applet.AudioClipClassTests<AudioClip> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.applet.AudioClip]

    @Override
    public Class<AudioClip> createNewSUT() {
        return AudioClip.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.applet.AudioClip]

}
