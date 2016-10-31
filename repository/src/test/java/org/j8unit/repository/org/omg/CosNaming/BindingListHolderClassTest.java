package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingListHolder;

@RunWith(J8Unit4.class)
public class BindingListHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingListHolderClassTests<BindingListHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.BindingListHolder]

    @Override
    public Class<BindingListHolder> createNewSUT() {
        return BindingListHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingListHolder#BindingListHolder(org.omg.CosNaming.Binding[]) public
     * org.omg.CosNaming.BindingListHolder(org.omg.CosNaming.Binding[])}.
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
    public void create_BindingListHolder_BindingArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BindingListHolder sut = null; // = new BindingListHolder(org.omg.CosNaming.Binding[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingListHolder#BindingListHolder() public org.omg.CosNaming.BindingListHolder()}.
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
    public void create_BindingListHolder()
    throws Exception {
        // create new instance
        final BindingListHolder sut = new BindingListHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.BindingListHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.BindingListHolder]

}
