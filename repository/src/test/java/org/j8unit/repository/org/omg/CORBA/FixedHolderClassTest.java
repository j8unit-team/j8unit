package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.FixedHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FixedHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.FixedHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class FixedHolderClassTest
implements FixedHolderClassTests<FixedHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.FixedHolder]

    @Override
    public Class<FixedHolder> createNewSUT() {
        return FixedHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.FixedHolder#FixedHolder(java.math.BigDecimal) public
     * org.omg.CORBA.FixedHolder(java.math.BigDecimal)}.
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
    public void create_FixedHolder_BigDecimal()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FixedHolder sut = null; // = new FixedHolder(java.math.BigDecimal);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.FixedHolder#FixedHolder() public
     * org.omg.CORBA.FixedHolder()}.
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
    public void create_FixedHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FixedHolder sut = new FixedHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.FixedHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.FixedHolder]

}
