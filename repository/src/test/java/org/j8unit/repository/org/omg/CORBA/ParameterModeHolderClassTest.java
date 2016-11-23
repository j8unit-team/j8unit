package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ParameterModeHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParameterModeHolder} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ParameterModeHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ParameterModeHolderClassTest
implements ParameterModeHolderClassTests<ParameterModeHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ParameterModeHolder]

    @Override
    public Class<ParameterModeHolder> createNewSUT() {
        return ParameterModeHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ParameterModeHolder#ParameterModeHolder(org.omg.CORBA.ParameterMode) public
     * org.omg.CORBA.ParameterModeHolder(org.omg.CORBA.ParameterMode)}.
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
    public void create_ParameterModeHolder_ParameterMode()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParameterModeHolder sut = null; // = new ParameterModeHolder(org.omg.CORBA.ParameterMode);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ParameterModeHolder#ParameterModeHolder() public org.omg.CORBA.ParameterModeHolder()}.
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
    public void create_ParameterModeHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParameterModeHolder sut = new ParameterModeHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ParameterModeHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ParameterModeHolder]

}
