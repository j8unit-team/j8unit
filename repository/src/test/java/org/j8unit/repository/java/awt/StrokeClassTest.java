package org.j8unit.repository.java.awt;

import java.awt.Stroke;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Stroke} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.StrokeClassTests}).
 */
@RunWith(J8Unit4.class)
public class StrokeClassTest
implements StrokeClassTests<Stroke> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Stroke]

    @Override
    public Class<Stroke> createNewSUT() {
        return Stroke.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Stroke]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Stroke]

}
