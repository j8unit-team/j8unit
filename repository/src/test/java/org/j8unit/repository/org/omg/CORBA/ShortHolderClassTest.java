package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ShortHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ShortHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ShortHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class ShortHolderClassTest
implements ShortHolderClassTests<ShortHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ShortHolder]

    @Override
    public Class<ShortHolder> createNewSUT() {
        return ShortHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.ShortHolder#ShortHolder(short)
     * public org.omg.CORBA.ShortHolder(short)}.
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
    public void create_ShortHolder_short()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ShortHolder sut = null; // = new ShortHolder(short);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.ShortHolder#ShortHolder() public
     * org.omg.CORBA.ShortHolder()}.
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
    public void create_ShortHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ShortHolder sut = new ShortHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ShortHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ShortHolder]

}
