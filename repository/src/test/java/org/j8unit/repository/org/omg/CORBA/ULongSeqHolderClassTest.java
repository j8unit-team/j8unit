package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ULongSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ULongSeqHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ULongSeqHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class ULongSeqHolderClassTest
implements ULongSeqHolderClassTests<ULongSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ULongSeqHolder]

    @Override
    public Class<ULongSeqHolder> createNewSUT() {
        return ULongSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ULongSeqHolder#ULongSeqHolder(int[]) public org.omg.CORBA.ULongSeqHolder(int[])}.
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
    public void create_ULongSeqHolder_intArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ULongSeqHolder sut = null; // = new ULongSeqHolder(int[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.ULongSeqHolder#ULongSeqHolder()
     * public org.omg.CORBA.ULongSeqHolder()}.
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
    public void create_ULongSeqHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ULongSeqHolder sut = new ULongSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ULongSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ULongSeqHolder]

}
