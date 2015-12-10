package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GraphicsClassTest
implements org.j8unit.repository.java.awt.GraphicsClassTests<java.awt.Graphics> {

    @Override
    public Class<java.awt.Graphics> createNewSUT() {
        return java.awt.Graphics.class;
    }

}
