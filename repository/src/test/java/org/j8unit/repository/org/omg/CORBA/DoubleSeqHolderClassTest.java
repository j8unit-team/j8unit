package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.DoubleSeqHolder;

@RunWith(J8Unit4.class)
public class DoubleSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.DoubleSeqHolderClassTests<DoubleSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DoubleSeqHolder]

    @Override
    public Class<DoubleSeqHolder> createNewSUT() {
        return DoubleSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.DoubleSeqHolder#DoubleSeqHolder(double[]) public org.omg.CORBA.DoubleSeqHolder(double[])}.
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
    public void create_DoubleSeqHolder_doubleArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DoubleSeqHolder sut = null; // = new DoubleSeqHolder(double[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.DoubleSeqHolder#DoubleSeqHolder()
     * public org.omg.CORBA.DoubleSeqHolder()}.
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
    public void create_DoubleSeqHolder()
    throws Exception {
        // create new instance
        final DoubleSeqHolder sut = new DoubleSeqHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DoubleSeqHolder]

}
