package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.EnumSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EnumSyntax} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.print.attribute.EnumSyntaxClassTests}).
 */

@RunWith(J8Unit4.class)
public class EnumSyntaxClassTest
implements EnumSyntaxClassTests<EnumSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.EnumSyntax]

    @Override
    public Class<EnumSyntax> createNewSUT() {
        return EnumSyntax.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.EnumSyntax]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.EnumSyntax]

}
