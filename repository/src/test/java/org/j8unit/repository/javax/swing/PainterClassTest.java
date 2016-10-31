package org.j8unit.repository.javax.swing;

import javax.swing.Painter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class PainterClassTest
implements org.j8unit.repository.javax.swing.PainterClassTests<Painter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Painter]

    @Override
    public Class<Painter> createNewSUT() {
        return Painter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.Painter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Painter]

}
