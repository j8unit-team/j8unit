package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GraphicsEnvironmentClassTest
implements org.j8unit.repository.java.awt.GraphicsEnvironmentClassTests<java.awt.GraphicsEnvironment> {

    @Override
    public Class<java.awt.GraphicsEnvironment> createNewSUT() {
        return java.awt.GraphicsEnvironment.class;
    }

}
