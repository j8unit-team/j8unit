package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.stylesheets.LinkStyle;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LinkStyle} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.stylesheets.LinkStyleClassTests}).
 */
@RunWith(J8Unit4.class)
public class LinkStyleClassTest
implements LinkStyleClassTests<LinkStyle> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.stylesheets.LinkStyle]

    @Override
    public Class<LinkStyle> createNewSUT() {
        return LinkStyle.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.stylesheets.LinkStyle]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.stylesheets.LinkStyle]

}
