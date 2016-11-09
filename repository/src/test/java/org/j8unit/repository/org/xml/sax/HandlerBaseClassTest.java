package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.HandlerBase;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HandlerBase} (by simply reusing the
 * J8Unit test interface {@link HandlerBaseClassTests}).
 */

@RunWith(J8Unit4.class)
public class HandlerBaseClassTest
implements HandlerBaseClassTests<HandlerBase> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.HandlerBase]

    @Override
    public Class<HandlerBase> createNewSUT() {
        return HandlerBase.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.xml.sax.HandlerBase#HandlerBase() public
     * org.xml.sax.HandlerBase()}.
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
    public void create_HandlerBase()
    throws Exception {
        // create new instance
        final HandlerBase sut = new HandlerBase();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.HandlerBase]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.HandlerBase]

}
