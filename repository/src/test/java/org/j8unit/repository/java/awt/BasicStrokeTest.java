package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicStrokeTest
implements org.j8unit.repository.java.awt.BasicStrokeTests<java.awt.BasicStroke> {

    @Override
    public java.awt.BasicStroke createNewSUT() {
        return new java.awt.BasicStroke();
    }

}
