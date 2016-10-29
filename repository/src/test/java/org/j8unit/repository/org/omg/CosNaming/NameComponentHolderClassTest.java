package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NameComponentHolder;

@RunWith(J8Unit4.class)
public class NameComponentHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NameComponentHolderClassTests<NameComponentHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NameComponentHolder]

    @Override
    public Class<NameComponentHolder> createNewSUT() {
        return NameComponentHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NameComponentHolder#NameComponentHolder(org.omg.CosNaming.NameComponent) public
     * org.omg.CosNaming.NameComponentHolder(org.omg.CosNaming.NameComponent)}.
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
    public void create_NameComponentHolder_NameComponent()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameComponentHolder sut = null; // = new NameComponentHolder(org.omg.CosNaming.NameComponent);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NameComponentHolder#NameComponentHolder() public
     * org.omg.CosNaming.NameComponentHolder()}.
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
    public void create_NameComponentHolder()
    throws Exception {
        // create new instance
        final NameComponentHolder sut = new NameComponentHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NameComponentHolder]

}
