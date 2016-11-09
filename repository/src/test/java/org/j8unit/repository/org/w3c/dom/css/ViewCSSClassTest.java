package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.ViewCSS;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ViewCSS} (by simply reusing the J8Unit
 * test interface {@link ViewCSSClassTests}).
 */

@RunWith(J8Unit4.class)
public class ViewCSSClassTest
implements ViewCSSClassTests<ViewCSS> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.ViewCSS]

    @Override
    public Class<ViewCSS> createNewSUT() {
        return ViewCSS.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.ViewCSS]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.ViewCSS]

}
