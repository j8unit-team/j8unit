package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicStrokeClassTest
implements org.j8unit.repository.java.awt.BasicStrokeClassTests<java.awt.BasicStroke> {

    @Override
    public Class<java.awt.BasicStroke> createNewSUT() {
        return java.awt.BasicStroke.class;
    }

}
