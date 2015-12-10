package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DimensionClassTest
implements org.j8unit.repository.java.awt.DimensionClassTests<java.awt.Dimension> {

    @Override
    public Class<java.awt.Dimension> createNewSUT() {
        return java.awt.Dimension.class;
    }

}
