package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShapeClassTest
implements org.j8unit.repository.java.awt.ShapeClassTests<java.awt.Shape> {

    @Override
    public Class<java.awt.Shape> createNewSUT() {
        return java.awt.Shape.class;
    }

}
