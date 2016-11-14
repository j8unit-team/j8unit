package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.SetOfIntegerSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SetOfIntegerSyntax} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.SetOfIntegerSyntaxClassTests}).
 */

@RunWith(J8Unit4.class)
public class SetOfIntegerSyntaxClassTest
implements SetOfIntegerSyntaxClassTests<SetOfIntegerSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.SetOfIntegerSyntax]

    @Override
    public Class<SetOfIntegerSyntax> createNewSUT() {
        return SetOfIntegerSyntax.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.SetOfIntegerSyntax]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.SetOfIntegerSyntax]

}
