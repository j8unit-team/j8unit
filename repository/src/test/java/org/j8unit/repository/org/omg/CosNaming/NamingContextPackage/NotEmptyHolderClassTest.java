package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;
import org.omg.CosNaming.NamingContextPackage.NotEmptyHolder;

@RunWith(J8Unit4.class)
public class NotEmptyHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotEmptyHolderClassTests<NotEmptyHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotEmptyHolder]

    @Override
    public Class<NotEmptyHolder> createNewSUT() {
        return NotEmptyHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NotEmptyHolder#NotEmptyHolder() public
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

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NotEmptyHolder#NotEmptyHolder(NotEmpty) public
     * org.omg.CosNaming.NamingContextPackage.NotEmptyHolder(org.omg.CosNaming.NamingContextPackage.NotEmpty)}.
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
        final NotEmptyHolder sut = null; // = new NotEmptyHolder(NotEmpty);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotEmptyHolder]

}
