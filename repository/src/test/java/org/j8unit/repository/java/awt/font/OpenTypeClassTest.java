package org.j8unit.repository.java.awt.font;

import java.awt.font.OpenType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenType} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.font.OpenTypeClassTests}).
 */
@RunWith(J8Unit4.class)
public class OpenTypeClassTest
implements OpenTypeClassTests<OpenType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.font.OpenType]

    @Override
    public Class<OpenType> createNewSUT() {
        return OpenType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.font.OpenType]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.font.OpenType]

}
