package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.LongLongSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongLongSeqHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.LongLongSeqHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class LongLongSeqHolderClassTest
implements LongLongSeqHolderClassTests<LongLongSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.LongLongSeqHolder]

    @Override
    public Class<LongLongSeqHolder> createNewSUT() {
        return LongLongSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.LongLongSeqHolder#LongLongSeqHolder(long[]) public org.omg.CORBA.LongLongSeqHolder(long[])}.
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
    public void create_LongLongSeqHolder_longArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LongLongSeqHolder sut = null; // = new LongLongSeqHolder(long[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.LongLongSeqHolder#LongLongSeqHolder() public org.omg.CORBA.LongLongSeqHolder()}.
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
    public void create_LongLongSeqHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LongLongSeqHolder sut = new LongLongSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.LongLongSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.LongLongSeqHolder]

}
