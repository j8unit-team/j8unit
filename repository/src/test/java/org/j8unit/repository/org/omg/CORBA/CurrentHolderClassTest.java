package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.CurrentHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CurrentHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.CurrentHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class CurrentHolderClassTest
implements CurrentHolderClassTests<CurrentHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.CurrentHolder]

    @Override
    public Class<CurrentHolder> createNewSUT() {
        return CurrentHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.CurrentHolder#CurrentHolder(org.omg.CORBA.Current) public
     * org.omg.CORBA.CurrentHolder(org.omg.CORBA.Current)}.
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
    public void create_CurrentHolder_Current()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CurrentHolder sut = null; // = new CurrentHolder(org.omg.CORBA.Current);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.CurrentHolder#CurrentHolder()
     * public org.omg.CORBA.CurrentHolder()}.
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
    public void create_CurrentHolder()
    throws Exception {
        // create new instance
        final CurrentHolder sut = new CurrentHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.CurrentHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.CurrentHolder]

}
