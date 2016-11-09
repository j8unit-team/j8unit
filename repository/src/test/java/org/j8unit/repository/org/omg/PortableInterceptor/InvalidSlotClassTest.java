package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.InvalidSlot;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidSlot} (by simply reusing the
 * J8Unit test interface {@link InvalidSlotClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidSlotClassTest
implements InvalidSlotClassTests<InvalidSlot> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.InvalidSlot]

    @Override
    public Class<InvalidSlot> createNewSUT() {
        return InvalidSlot.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.InvalidSlot#InvalidSlot() public org.omg.PortableInterceptor.InvalidSlot()}.
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
    public void create_InvalidSlot()
    throws Exception {
        // create new instance
        final InvalidSlot sut = new InvalidSlot();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.InvalidSlot#InvalidSlot(String) public
     * org.omg.PortableInterceptor.InvalidSlot(java.lang.String)}.
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
    public void create_InvalidSlot_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidSlot sut = null; // = new InvalidSlot(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.InvalidSlot]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.InvalidSlot]

}
