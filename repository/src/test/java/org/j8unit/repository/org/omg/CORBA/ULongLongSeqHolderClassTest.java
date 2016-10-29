package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ULongLongSeqHolder;

@RunWith(J8Unit4.class)
public class ULongLongSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ULongLongSeqHolderClassTests<ULongLongSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ULongLongSeqHolder]

    @Override
    public Class<ULongLongSeqHolder> createNewSUT() {
        return ULongLongSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ULongLongSeqHolder#ULongLongSeqHolder(long[]) public
     * org.omg.CORBA.ULongLongSeqHolder(long[])}.
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
    public void create_ULongLongSeqHolder_longArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ULongLongSeqHolder sut = null; // = new ULongLongSeqHolder(long[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ULongLongSeqHolder#ULongLongSeqHolder() public org.omg.CORBA.ULongLongSeqHolder()}.
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
    public void create_ULongLongSeqHolder()
    throws Exception {
        // create new instance
        final ULongLongSeqHolder sut = new ULongLongSeqHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ULongLongSeqHolder]

}
