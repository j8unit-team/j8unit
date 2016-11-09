package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.Size2DSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Size2DSyntax} (by simply reusing the
 * J8Unit test interface {@link Size2DSyntaxClassTests}).
 */

@RunWith(J8Unit4.class)
public class Size2DSyntaxClassTest
implements Size2DSyntaxClassTests<Size2DSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.Size2DSyntax]

    @Override
    public Class<Size2DSyntax> createNewSUT() {
        return Size2DSyntax.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.Size2DSyntax]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.Size2DSyntax]

}
