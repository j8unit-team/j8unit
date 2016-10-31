package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.IORHolder;

@RunWith(J8Unit4.class)
public class IORHolderClassTest
implements org.j8unit.repository.org.omg.IOP.IORHolderClassTests<IORHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.IORHolder]

    @Override
    public Class<IORHolder> createNewSUT() {
        return IORHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.IORHolder#IORHolder(org.omg.IOP.IOR) public org.omg.IOP.IORHolder(org.omg.IOP.IOR)}.
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
    public void create_IORHolder_IOR()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IORHolder sut = null; // = new IORHolder(org.omg.IOP.IOR);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.IOP.IORHolder#IORHolder() public
     * org.omg.IOP.IORHolder()}.
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
    public void create_IORHolder()
    throws Exception {
        // create new instance
        final IORHolder sut = new IORHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.IORHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.IORHolder]

}
