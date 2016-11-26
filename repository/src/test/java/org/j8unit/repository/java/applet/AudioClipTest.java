package org.j8unit.repository.java.applet;

import java.applet.AudioClip;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AudioClip} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.applet.AudioClipTests}).
 */
@RunWith(J8Unit4.class)
public class AudioClipTest
implements AudioClipTests<AudioClip> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.applet.AudioClip]

    @Override
    public AudioClip createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.applet.AudioClip], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.applet.AudioClip]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.applet.AudioClip]

}
