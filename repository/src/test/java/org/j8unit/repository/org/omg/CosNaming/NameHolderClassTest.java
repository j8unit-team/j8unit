package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NameHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NameHolder} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CosNaming.NameHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class NameHolderClassTest
implements NameHolderClassTests<NameHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NameHolder]

    @Override
    public Class<NameHolder> createNewSUT() {
        return NameHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NameHolder#NameHolder(org.omg.CosNaming.NameComponent[]) public
     * org.omg.CosNaming.NameHolder(org.omg.CosNaming.NameComponent[])}.
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
    public void create_NameHolder_NameComponentArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameHolder sut = null; // = new NameHolder(org.omg.CosNaming.NameComponent[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CosNaming.NameHolder#NameHolder()
     * public org.omg.CosNaming.NameHolder()}.
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
    public void create_NameHolder()
    throws Exception {
        // create new instance
        final NameHolder sut = new NameHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NameHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NameHolder]

}
