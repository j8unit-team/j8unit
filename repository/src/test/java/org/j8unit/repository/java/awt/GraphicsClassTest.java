package org.j8unit.repository.java.awt;

import java.awt.Graphics;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Graphics} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.GraphicsClassTests}).
 */

@RunWith(J8Unit4.class)
public class GraphicsClassTest
implements GraphicsClassTests<Graphics> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Graphics]

    @Override
    public Class<Graphics> createNewSUT() {
        return Graphics.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Graphics]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Graphics]

}
