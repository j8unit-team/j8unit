package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.OctetSeqHolder;

@RunWith(J8Unit4.class)
public class OctetSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.OctetSeqHolderClassTests<OctetSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.OctetSeqHolder]

    @Override
    public Class<OctetSeqHolder> createNewSUT() {
        return OctetSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.OctetSeqHolder#OctetSeqHolder(byte[]) public org.omg.CORBA.OctetSeqHolder(byte[])}.
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
    public void create_OctetSeqHolder_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OctetSeqHolder sut = null; // = new OctetSeqHolder(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.OctetSeqHolder#OctetSeqHolder()
     * public org.omg.CORBA.OctetSeqHolder()}.
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
    public void create_OctetSeqHolder()
    throws Exception {
        // create new instance
        final OctetSeqHolder sut = new OctetSeqHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.OctetSeqHolder]

}
