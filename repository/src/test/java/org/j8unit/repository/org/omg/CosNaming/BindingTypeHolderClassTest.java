package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingTypeHolder;

@RunWith(J8Unit4.class)
public class BindingTypeHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingTypeHolderClassTests<BindingTypeHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.BindingTypeHolder]

    @Override
    public Class<BindingTypeHolder> createNewSUT() {
        return BindingTypeHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingTypeHolder#BindingTypeHolder(org.omg.CosNaming.BindingType) public
     * org.omg.CosNaming.BindingTypeHolder(org.omg.CosNaming.BindingType)}.
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
    public void create_BindingTypeHolder_BindingType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BindingTypeHolder sut = null; // = new BindingTypeHolder(org.omg.CosNaming.BindingType);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingTypeHolder#BindingTypeHolder() public org.omg.CosNaming.BindingTypeHolder()}.
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
    public void create_BindingTypeHolder()
    throws Exception {
        // create new instance
        final BindingTypeHolder sut = new BindingTypeHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.BindingTypeHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.BindingTypeHolder]

}
