package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;

@RunWith(J8Unit4.class)
public class NotEmptyClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotEmptyClassTests<NotEmpty> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotEmpty]

    @Override
    public Class<NotEmpty> createNewSUT() {
        return NotEmpty.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NotEmpty#NotEmpty() public
     * org.omg.CosNaming.NamingContextPackage.NotEmpty()}.
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
    public void create_NotEmpty()
    throws Exception {
        // create new instance
        final NotEmpty sut = new NotEmpty();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NotEmpty#NotEmpty(String) public
     * org.omg.CosNaming.NamingContextPackage.NotEmpty(java.lang.String)}.
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
    public void create_NotEmpty_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotEmpty sut = null; // = new NotEmpty(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.NotEmpty]

}
