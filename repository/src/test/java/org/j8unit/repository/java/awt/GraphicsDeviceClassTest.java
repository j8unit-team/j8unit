package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GraphicsDeviceClassTest
implements org.j8unit.repository.java.awt.GraphicsDeviceClassTests<java.awt.GraphicsDevice> {

    @Override
    public Class<java.awt.GraphicsDevice> createNewSUT() {
        return java.awt.GraphicsDevice.class;
    }

    @RunWith(J8Unit4.class)
    public static class WindowTranslucencyClassTest
    implements org.j8unit.repository.java.awt.GraphicsDeviceClassTests.WindowTranslucencyClassTests<java.awt.GraphicsDevice.WindowTranslucency> {

        @Override
        public Class<java.awt.GraphicsDevice.WindowTranslucency> createNewSUT() {
            return java.awt.GraphicsDevice.WindowTranslucency.class;
        }

    }

}
