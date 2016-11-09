package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMException} (by simply reusing the
 * J8Unit test interface {@link DOMExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMExceptionClassTest
implements DOMExceptionClassTests<DOMException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMException]

    @Override
    public Class<DOMException> createNewSUT() {
        return DOMException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.w3c.dom.DOMException#DOMException(short, String) public
     * org.w3c.dom.DOMException(short,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DOMException_short_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DOMException sut = null; // = new DOMException(short, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMException]

}
