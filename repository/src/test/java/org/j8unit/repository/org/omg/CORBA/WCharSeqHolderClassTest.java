package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.WCharSeqHolder;

@RunWith(J8Unit4.class)
public class WCharSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.WCharSeqHolderClassTests<WCharSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.WCharSeqHolder]

    @Override
    public Class<WCharSeqHolder> createNewSUT() {
        return WCharSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.WCharSeqHolder#WCharSeqHolder(char[]) public org.omg.CORBA.WCharSeqHolder(char[])}.
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
    public void create_WCharSeqHolder_charArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WCharSeqHolder sut = null; // = new WCharSeqHolder(char[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.WCharSeqHolder#WCharSeqHolder()
     * public org.omg.CORBA.WCharSeqHolder()}.
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
    public void create_WCharSeqHolder()
    throws Exception {
        // create new instance
        final WCharSeqHolder sut = new WCharSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.WCharSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.WCharSeqHolder]

}
