package org.j8unit.repository.java.awt;

import java.awt.GraphicsConfiguration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GraphicsConfiguration} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.GraphicsConfigurationClassTests}).
 */

@RunWith(J8Unit4.class)
public class GraphicsConfigurationClassTest
implements GraphicsConfigurationClassTests<GraphicsConfiguration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.GraphicsConfiguration]

    @Override
    public Class<GraphicsConfiguration> createNewSUT() {
        return GraphicsConfiguration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.GraphicsConfiguration]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.GraphicsConfiguration]

}
