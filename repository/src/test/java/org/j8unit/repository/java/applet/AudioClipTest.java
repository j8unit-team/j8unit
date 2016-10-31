package org.j8unit.repository.java.applet;

import java.applet.AudioClip;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioClipTest
implements org.j8unit.repository.java.applet.AudioClipTests<AudioClip> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.applet.AudioClip]

    @Override
    public AudioClip createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.applet.AudioClip], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.applet.AudioClip]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.applet.AudioClip]

}
