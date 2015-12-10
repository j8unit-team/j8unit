package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PointTest
implements org.j8unit.repository.java.awt.PointTests<java.awt.Point> {

    @Override
    public java.awt.Point createNewSUT() {
        return new java.awt.Point();
    }

}
