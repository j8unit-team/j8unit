package org.j8unit.repository.java.awt;

import java.awt.Transparency;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Transparency} (by simply reusing the
 * J8Unit test interface {@link TransparencyClassTests}).
 */

@RunWith(J8Unit4.class)
public class TransparencyClassTest
implements TransparencyClassTests<Transparency> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Transparency]

    @Override
    public Class<Transparency> createNewSUT() {
        return Transparency.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Transparency]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Transparency]

}
