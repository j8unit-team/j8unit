package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.DoubleHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoubleHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.DoubleHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class DoubleHolderClassTest
implements DoubleHolderClassTests<DoubleHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DoubleHolder]

    @Override
    public Class<DoubleHolder> createNewSUT() {
        return DoubleHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.DoubleHolder#DoubleHolder(double)
     * public org.omg.CORBA.DoubleHolder(double)}.
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
    public void create_DoubleHolder_double()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DoubleHolder sut = null; // = new DoubleHolder(double);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.DoubleHolder#DoubleHolder()
     * public org.omg.CORBA.DoubleHolder()}.
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
    public void create_DoubleHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DoubleHolder sut = new DoubleHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DoubleHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DoubleHolder]

}
