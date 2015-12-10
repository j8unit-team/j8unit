package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ColorClassTest
implements org.j8unit.repository.java.awt.ColorClassTests<java.awt.Color> {

    @Override
    public Class<java.awt.Color> createNewSUT() {
        return java.awt.Color.class;
    }

}
