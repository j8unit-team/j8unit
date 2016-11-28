package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.stylesheets.LinkStyle;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LinkStyle} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.stylesheets.LinkStyleTests}).
 */
@RunWith(J8Unit4.class)
public class LinkStyleTest
implements LinkStyleTests<LinkStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.stylesheets.LinkStyle]

    @Override
    public LinkStyle createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.stylesheets.LinkStyle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.stylesheets.LinkStyle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.stylesheets.LinkStyle]

}
