package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotFoundReasonHolder} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class NotFoundReasonHolderClassTest
implements NotFoundReasonHolderClassTests<NotFoundReasonHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder]

    @Override
    public Class<NotFoundReasonHolder> createNewSUT() {
        return NotFoundReasonHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder#NotFoundReasonHolder(org.omg.CosNaming.NamingContextPackage.NotFoundReason)
     * public
     * org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder(org.omg.CosNaming.NamingContextPackage.NotFoundReason)}.
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
    public void create_NotFoundReasonHolder_NotFoundReason()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotFoundReasonHolder sut = null; // = new
                                               // NotFoundReasonHolder(org.omg.CosNaming.NamingContextPackage.NotFoundReason);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder#NotFoundReasonHolder() public
     * org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder()}.
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
    public void create_NotFoundReasonHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotFoundReasonHolder sut = new NotFoundReasonHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder]

}
