package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CanvasTest
implements org.j8unit.repository.java.awt.CanvasTests<java.awt.Canvas> {

    @Override
    public java.awt.Canvas createNewSUT() {
        return new java.awt.Canvas();
    }

}
