package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.stylesheets.DocumentStyle;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentStyle} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.stylesheets.DocumentStyleClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentStyleClassTest
implements DocumentStyleClassTests<DocumentStyle> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.stylesheets.DocumentStyle]

    @Override
    public Class<DocumentStyle> createNewSUT() {
        return DocumentStyle.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.stylesheets.DocumentStyle]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.stylesheets.DocumentStyle]

}
