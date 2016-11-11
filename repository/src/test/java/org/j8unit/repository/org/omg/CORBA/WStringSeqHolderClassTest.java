package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.WStringSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WStringSeqHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.WStringSeqHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class WStringSeqHolderClassTest
implements WStringSeqHolderClassTests<WStringSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.WStringSeqHolder]

    @Override
    public Class<WStringSeqHolder> createNewSUT() {
        return WStringSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.WStringSeqHolder#WStringSeqHolder(String[]) public
     * org.omg.CORBA.WStringSeqHolder(java.lang.String[])}.
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
    public void create_WStringSeqHolder_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WStringSeqHolder sut = null; // = new WStringSeqHolder(String[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.WStringSeqHolder#WStringSeqHolder() public org.omg.CORBA.WStringSeqHolder()}.
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
    public void create_WStringSeqHolder()
    throws Exception {
        // create new instance
        final WStringSeqHolder sut = new WStringSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.WStringSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.WStringSeqHolder]

}
