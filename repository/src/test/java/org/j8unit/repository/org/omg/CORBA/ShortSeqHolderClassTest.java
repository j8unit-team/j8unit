package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ShortSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ShortSeqHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ShortSeqHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ShortSeqHolderClassTest
implements ShortSeqHolderClassTests<ShortSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ShortSeqHolder]

    @Override
    public Class<ShortSeqHolder> createNewSUT() {
        return ShortSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ShortSeqHolder#ShortSeqHolder(short[]) public org.omg.CORBA.ShortSeqHolder(short[])}.
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
    public void create_ShortSeqHolder_shortArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ShortSeqHolder sut = null; // = new ShortSeqHolder(short[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.ShortSeqHolder#ShortSeqHolder()
     * public org.omg.CORBA.ShortSeqHolder()}.
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
    public void create_ShortSeqHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ShortSeqHolder sut = new ShortSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ShortSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ShortSeqHolder]

}
