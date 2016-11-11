package org.j8unit.repository.java.awt.font;

import java.awt.font.GraphicAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GraphicAttribute} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.font.GraphicAttributeClassTests}).
 */

@RunWith(J8Unit4.class)
public class GraphicAttributeClassTest
implements GraphicAttributeClassTests<GraphicAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.font.GraphicAttribute]

    @Override
    public Class<GraphicAttribute> createNewSUT() {
        return GraphicAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.font.GraphicAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.font.GraphicAttribute]

}
