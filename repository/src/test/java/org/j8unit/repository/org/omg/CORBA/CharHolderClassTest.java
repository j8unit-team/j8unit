package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.CharHolder;

@RunWith(J8Unit4.class)
public class CharHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.CharHolderClassTests<CharHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.CharHolder]

    @Override
    public Class<CharHolder> createNewSUT() {
        return CharHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link CharHolder#CharHolder() public
     * org.omg.CORBA.CharHolder()}.
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
    public void create_CharHolder()
    throws Exception {
        // create new instance
        final CharHolder sut = new CharHolder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link CharHolder#CharHolder(char) public
     * org.omg.CORBA.CharHolder(char)}.
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
    public void create_CharHolder_char()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CharHolder sut = null; // = new CharHolder(char);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.CharHolder]

}
