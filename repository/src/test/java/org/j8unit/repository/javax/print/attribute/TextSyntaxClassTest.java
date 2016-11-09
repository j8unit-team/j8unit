package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.TextSyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextSyntax} (by simply reusing the J8Unit
 * test interface {@link TextSyntaxClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextSyntaxClassTest
implements TextSyntaxClassTests<TextSyntax> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.TextSyntax]

    @Override
    public Class<TextSyntax> createNewSUT() {
        return TextSyntax.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.TextSyntax]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.TextSyntax]

}
