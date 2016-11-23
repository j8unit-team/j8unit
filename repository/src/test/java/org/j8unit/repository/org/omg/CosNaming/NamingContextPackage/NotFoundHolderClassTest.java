package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotFoundHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotFoundHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotFoundHolderClassTest
implements NotFoundHolderClassTests<NotFoundHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFoundHolder]

    @Override
    public Class<NotFoundHolder> createNewSUT() {
        return NotFoundHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotFoundHolder#NotFoundHolder(org.omg.CosNaming.NamingContextPackage.NotFound)
     * public org.omg.CosNaming.NamingContextPackage.NotFoundHolder(org.omg.CosNaming.NamingContextPackage.NotFound)}.
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
    public void create_NotFoundHolder_NotFound()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotFoundHolder sut = null; // = new NotFoundHolder(org.omg.CosNaming.NamingContextPackage.NotFound);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotFoundHolder#NotFoundHolder() public
     * org.omg.CosNaming.NamingContextPackage.NotFoundHolder()}.
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
    public void create_NotFoundHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotFoundHolder sut = new NotFoundHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFoundHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFoundHolder]

}
