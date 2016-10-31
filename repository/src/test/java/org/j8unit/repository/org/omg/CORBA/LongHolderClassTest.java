package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.LongHolder;

@RunWith(J8Unit4.class)
public class LongHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.LongHolderClassTests<LongHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.LongHolder]

    @Override
    public Class<LongHolder> createNewSUT() {
        return LongHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.LongHolder#LongHolder(long)
     * public org.omg.CORBA.LongHolder(long)}.
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
    public void create_LongHolder_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LongHolder sut = null; // = new LongHolder(long);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.LongHolder#LongHolder() public
     * org.omg.CORBA.LongHolder()}.
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
    public void create_LongHolder()
    throws Exception {
        // create new instance
        final LongHolder sut = new LongHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.LongHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.LongHolder]

}
