package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.CosNaming.NamingContextPackage.NotFoundHolder;

@RunWith(J8Unit4.class)
public class NotFoundHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundHolderClassTests<NotFoundHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFoundHolder]

    @Override
    public Class<NotFoundHolder> createNewSUT() {
        return NotFoundHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NotFoundHolder#NotFoundHolder() public
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
        final NotFoundHolder sut = new NotFoundHolder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NotFoundHolder#NotFoundHolder(NotFound) public
     * org.omg.CosNaming.NamingContextPackage.NotFoundHolder(org.omg.CosNaming.NamingContextPackage.NotFound)}.
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
        final NotFoundHolder sut = null; // = new NotFoundHolder(NotFound);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotFoundHolder]

}
