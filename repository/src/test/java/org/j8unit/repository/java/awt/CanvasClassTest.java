package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CanvasClassTest
implements org.j8unit.repository.java.awt.CanvasClassTests<java.awt.Canvas> {

    @Override
    public Class<java.awt.Canvas> createNewSUT() {
        return java.awt.Canvas.class;
    }

}
