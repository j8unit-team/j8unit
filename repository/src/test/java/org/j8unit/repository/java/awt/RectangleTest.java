package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RectangleTest
implements org.j8unit.repository.java.awt.RectangleTests<java.awt.Rectangle> {

    @Override
    public java.awt.Rectangle createNewSUT() {
        return new java.awt.Rectangle();
    }

}
