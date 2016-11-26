package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.DOMImplementationCSS;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMImplementationCSS} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.DOMImplementationCSSClassTests}).
 */
@RunWith(J8Unit4.class)
public class DOMImplementationCSSClassTest
implements DOMImplementationCSSClassTests<DOMImplementationCSS> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.DOMImplementationCSS]

    @Override
    public Class<DOMImplementationCSS> createNewSUT() {
        return DOMImplementationCSS.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.DOMImplementationCSS]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.DOMImplementationCSS]

}
