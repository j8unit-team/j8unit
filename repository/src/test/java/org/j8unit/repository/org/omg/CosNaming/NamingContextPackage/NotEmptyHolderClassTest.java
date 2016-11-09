package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotEmptyHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotEmptyHolder} (by simply reusing the
 * J8Unit test interface {@link NotEmptyHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotEmptyHolderClassTest
implements NotEmptyHolderClassTests<NotEmptyHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotEmptyHolder]

    @Override
    public Class<NotEmptyHolder> createNewSUT() {
        return NotEmptyHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotEmptyHolder#NotEmptyHolder(org.omg.CosNaming.NamingContextPackage.NotEmpty)
     * public org.omg.CosNaming.NamingContextPackage.NotEmptyHolder(org.omg.CosNaming.NamingContextPackage.NotEmpty)}.
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
    public void create_NotEmptyHolder_NotEmpty()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotEmptyHolder sut = null; // = new NotEmptyHolder(org.omg.CosNaming.NamingContextPackage.NotEmpty);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotEmptyHolder#NotEmptyHolder() public
     * org.omg.CosNaming.NamingContextPackage.NotEmptyHolder()}.
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
    public void create_NotEmptyHolder()
    throws Exception {
        // create new instance
        final NotEmptyHolder sut = new NotEmptyHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotEmptyHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotEmptyHolder]

}
