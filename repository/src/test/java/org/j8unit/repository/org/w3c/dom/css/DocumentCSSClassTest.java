package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.DocumentCSS;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentCSS} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.DocumentCSSClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentCSSClassTest
implements DocumentCSSClassTests<DocumentCSS> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.DocumentCSS]

    @Override
    public Class<DocumentCSS> createNewSUT() {
        return DocumentCSS.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.DocumentCSS]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.DocumentCSS]

}
