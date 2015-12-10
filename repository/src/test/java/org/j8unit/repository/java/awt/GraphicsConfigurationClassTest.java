package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GraphicsConfigurationClassTest
implements org.j8unit.repository.java.awt.GraphicsConfigurationClassTests<java.awt.GraphicsConfiguration> {

    @Override
    public Class<java.awt.GraphicsConfiguration> createNewSUT() {
        return java.awt.GraphicsConfiguration.class;
    }

}
