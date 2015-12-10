package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DimensionTest
implements org.j8unit.repository.java.awt.DimensionTests<java.awt.Dimension> {

    @Override
    public java.awt.Dimension createNewSUT() {
        return new java.awt.Dimension();
    }

}
