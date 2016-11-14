package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.AnyHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnyHolder} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.AnyHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class AnyHolderClassTest
implements AnyHolderClassTests<AnyHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.AnyHolder]

    @Override
    public Class<AnyHolder> createNewSUT() {
        return AnyHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.AnyHolder#AnyHolder(org.omg.CORBA.Any) public org.omg.CORBA.AnyHolder(org.omg.CORBA.Any)}.
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
    public void create_AnyHolder_Any()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AnyHolder sut = null; // = new AnyHolder(org.omg.CORBA.Any);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.AnyHolder#AnyHolder() public
     * org.omg.CORBA.AnyHolder()}.
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
    public void create_AnyHolder()
    throws Exception {
        // create new instance
        final AnyHolder sut = new AnyHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.AnyHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.AnyHolder]

}
