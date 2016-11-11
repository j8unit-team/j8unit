package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.stylesheets.DocumentStyle;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocumentStyle} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.stylesheets.DocumentStyleTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentStyleTest
implements DocumentStyleTests<DocumentStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.stylesheets.DocumentStyle]

    @Override
    public DocumentStyle createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.stylesheets.DocumentStyle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.stylesheets.DocumentStyle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.stylesheets.DocumentStyle]

}
