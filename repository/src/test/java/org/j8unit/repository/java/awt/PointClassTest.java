package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PointClassTest
implements org.j8unit.repository.java.awt.PointClassTests<java.awt.Point> {

    @Override
    public Class<java.awt.Point> createNewSUT() {
        return java.awt.Point.class;
    }

}
