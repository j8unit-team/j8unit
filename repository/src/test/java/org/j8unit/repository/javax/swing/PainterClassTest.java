package org.j8unit.repository.javax.swing;

import javax.swing.Painter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Painter} (by simply reusing the J8Unit
 * test interface {@link PainterClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class PainterClassTest
implements PainterClassTests<Painter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Painter]

    @Override
    public Class<Painter> createNewSUT() {
        return Painter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.Painter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Painter]

}
