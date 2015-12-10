package org.j8unit.repository.java.applet;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioClipClassTest
implements org.j8unit.repository.java.applet.AudioClipClassTests<java.applet.AudioClip> {

    @Override
    public Class<java.applet.AudioClip> createNewSUT() {
        return java.applet.AudioClip.class;
    }

}
