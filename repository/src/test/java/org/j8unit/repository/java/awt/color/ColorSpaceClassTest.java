package org.j8unit.repository.java.awt.color;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ColorSpaceClassTest
implements org.j8unit.repository.java.awt.color.ColorSpaceClassTests<java.awt.color.ColorSpace> {

    @Override
    public Class<java.awt.color.ColorSpace> createNewSUT() {
        return java.awt.color.ColorSpace.class;
    }

}
