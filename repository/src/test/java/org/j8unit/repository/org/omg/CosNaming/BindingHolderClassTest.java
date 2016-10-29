package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingHolder;

@RunWith(J8Unit4.class)
public class BindingHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingHolderClassTests<BindingHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.BindingHolder]

    @Override
    public Class<BindingHolder> createNewSUT() {
        return BindingHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingHolder#BindingHolder(org.omg.CosNaming.Binding) public
     * org.omg.CosNaming.BindingHolder(org.omg.CosNaming.Binding)}.
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
    public void create_BindingHolder_Binding()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BindingHolder sut = null; // = new BindingHolder(org.omg.CosNaming.Binding);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CosNaming.BindingHolder#BindingHolder()
     * public org.omg.CosNaming.BindingHolder()}.
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
    public void create_BindingHolder()
    throws Exception {
        // create new instance
        final BindingHolder sut = new BindingHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.BindingHolder]

}
