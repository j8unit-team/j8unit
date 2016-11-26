package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NameComponent;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NameComponent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NameComponentClassTests}).
 */
@RunWith(J8Unit4.class)
public class NameComponentClassTest
implements NameComponentClassTests<NameComponent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NameComponent]

    @Override
    public Class<NameComponent> createNewSUT() {
        return NameComponent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CosNaming.NameComponent#NameComponent()
     * public org.omg.CosNaming.NameComponent()}.
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
    public void create_NameComponent()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameComponent sut = new NameComponent();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NameComponent#NameComponent(String, String) public
     * org.omg.CosNaming.NameComponent(java.lang.String,java.lang.String)}.
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
    public void create_NameComponent_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameComponent sut = null; // = new NameComponent(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NameComponent]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NameComponent]

}
