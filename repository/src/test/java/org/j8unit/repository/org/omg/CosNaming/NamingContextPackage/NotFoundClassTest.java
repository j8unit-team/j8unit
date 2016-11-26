package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotFound} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundClassTests}).
 */
@RunWith(J8Unit4.class)
public class NotFoundClassTest
implements NotFoundClassTests<NotFound> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFound]

    @Override
    public Class<NotFound> createNewSUT() {
        return NotFound.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotFound#NotFound() public
     * org.omg.CosNaming.NamingContextPackage.NotFound()}.
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
    public void create_NotFound()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotFound sut = new NotFound();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotFound#NotFound(org.omg.CosNaming.NamingContextPackage.NotFoundReason, org.omg.CosNaming.NameComponent[])
     * public
     * org.omg.CosNaming.NamingContextPackage.NotFound(org.omg.CosNaming.NamingContextPackage.NotFoundReason,org.omg.CosNaming.NameComponent[])}.
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
    public void create_NotFound_NotFoundReason_NameComponentArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotFound sut = null; // = new NotFound(org.omg.CosNaming.NamingContextPackage.NotFoundReason,
                                   // org.omg.CosNaming.NameComponent[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.NotFound#NotFound(String, org.omg.CosNaming.NamingContextPackage.NotFoundReason, org.omg.CosNaming.NameComponent[])
     * public
     * org.omg.CosNaming.NamingContextPackage.NotFound(java.lang.String,org.omg.CosNaming.NamingContextPackage.NotFoundReason,org.omg.CosNaming.NameComponent[])}.
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
    public void create_NotFound_String_NotFoundReason_NameComponentArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotFound sut = null; // = new NotFound(String, org.omg.CosNaming.NamingContextPackage.NotFoundReason,
                                   // org.omg.CosNaming.NameComponent[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFound]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFound]

}
