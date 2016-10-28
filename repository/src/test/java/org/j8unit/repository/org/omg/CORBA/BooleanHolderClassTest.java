package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.BooleanHolder;

@RunWith(J8Unit4.class)
public class BooleanHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.BooleanHolderClassTests<BooleanHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.BooleanHolder]

    @Override
    public Class<BooleanHolder> createNewSUT() {
        return BooleanHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.BooleanHolder#BooleanHolder()
     * public org.omg.CORBA.BooleanHolder()}.
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
    public void create_BooleanHolder()
    throws Exception {
        // create new instance
        final BooleanHolder sut = new BooleanHolder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.BooleanHolder#BooleanHolder(boolean) public org.omg.CORBA.BooleanHolder(boolean)}.
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
    public void create_BooleanHolder_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BooleanHolder sut = null; // = new BooleanHolder(boolean);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.BooleanHolder]

}
