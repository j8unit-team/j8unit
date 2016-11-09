package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.URISyntax;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URISyntax} (by simply reusing the J8Unit
 * test interface {@link URISyntaxClassTests}).
 */

@RunWith(J8Unit4.class)
public class URISyntaxClassTest
implements URISyntaxClassTests<URISyntax> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.URISyntax]

    @Override
    public Class<URISyntax> createNewSUT() {
        return URISyntax.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.URISyntax]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.URISyntax]

}
