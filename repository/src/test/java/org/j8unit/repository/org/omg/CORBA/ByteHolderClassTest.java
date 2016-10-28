package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ByteHolder;

@RunWith(J8Unit4.class)
public class ByteHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ByteHolderClassTests<ByteHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ByteHolder]

    @Override
    public Class<ByteHolder> createNewSUT() {
        return ByteHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ByteHolder#ByteHolder() public
     * org.omg.CORBA.ByteHolder()}.
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
    public void create_ByteHolder()
    throws Exception {
        // create new instance
        final ByteHolder sut = new ByteHolder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ByteHolder#ByteHolder(byte) public
     * org.omg.CORBA.ByteHolder(byte)}.
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
    public void create_ByteHolder_byte()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ByteHolder sut = null; // = new ByteHolder(byte);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ByteHolder]

}
