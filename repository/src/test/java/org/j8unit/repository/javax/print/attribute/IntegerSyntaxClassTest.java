package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.IntegerSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntegerSyntax} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.IntegerSyntaxClassTests}).
 */
@RunWith(J8Unit4.class)
public class IntegerSyntaxClassTest
implements IntegerSyntaxClassTests<IntegerSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.IntegerSyntax]

    @Override
    public Class<IntegerSyntax> createNewSUT() {
        return IntegerSyntax.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.IntegerSyntax]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.IntegerSyntax]

}
