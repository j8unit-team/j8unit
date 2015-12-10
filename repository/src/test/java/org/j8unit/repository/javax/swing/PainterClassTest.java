package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class PainterClassTest
implements org.j8unit.repository.javax.swing.PainterClassTests<javax.swing.Painter> {

    @Override
    public Class<javax.swing.Painter> createNewSUT() {
        return javax.swing.Painter.class;
    }

}
