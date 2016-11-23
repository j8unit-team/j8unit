package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.Binding;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Binding} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CosNaming.BindingClassTests}).
 */

@RunWith(J8Unit4.class)
public class BindingClassTest
implements BindingClassTests<Binding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.Binding]

    @Override
    public Class<Binding> createNewSUT() {
        return Binding.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CosNaming.Binding#Binding() public
     * org.omg.CosNaming.Binding()}.
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
    public void create_Binding()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Binding sut = new Binding();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.Binding#Binding(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.BindingType) public
     * org.omg.CosNaming.Binding(org.omg.CosNaming.NameComponent[],org.omg.CosNaming.BindingType)}.
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
    public void create_Binding_NameComponentArray_BindingType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Binding sut = null; // = new Binding(org.omg.CosNaming.NameComponent[], org.omg.CosNaming.BindingType);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.Binding]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.Binding]

}
