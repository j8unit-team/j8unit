package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.AttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeView} (by simply reusing the
 * J8Unit test interface {@link AttributeViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class AttributeViewClassTest
implements AttributeViewClassTests<AttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.AttributeView]

    @Override
    public Class<AttributeView> createNewSUT() {
        return AttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.AttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.AttributeView]

}
