package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.BooleanSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BooleanSeqHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.BooleanSeqHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class BooleanSeqHolderClassTest
implements BooleanSeqHolderClassTests<BooleanSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.BooleanSeqHolder]

    @Override
    public Class<BooleanSeqHolder> createNewSUT() {
        return BooleanSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.BooleanSeqHolder#BooleanSeqHolder(boolean[]) public
     * org.omg.CORBA.BooleanSeqHolder(boolean[])}.
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
    public void create_BooleanSeqHolder_booleanArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BooleanSeqHolder sut = null; // = new BooleanSeqHolder(boolean[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.BooleanSeqHolder#BooleanSeqHolder() public org.omg.CORBA.BooleanSeqHolder()}.
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
    public void create_BooleanSeqHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BooleanSeqHolder sut = new BooleanSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.BooleanSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.BooleanSeqHolder]

}
