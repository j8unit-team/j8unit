package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHolder;

@RunWith(J8Unit4.class)
public class NamingContextExtHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextExtHolderClassTests<NamingContextExtHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextExtHolder]

    @Override
    public Class<NamingContextExtHolder> createNewSUT() {
        return NamingContextExtHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NamingContextExtHolder#NamingContextExtHolder()
     * public org.omg.CosNaming.NamingContextExtHolder()}.
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
    public void create_NamingContextExtHolder()
    throws Exception {
        // create new instance
        final NamingContextExtHolder sut = new NamingContextExtHolder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NamingContextExtHolder#NamingContextExtHolder(NamingContextExt) public
     * org.omg.CosNaming.NamingContextExtHolder(org.omg.CosNaming.NamingContextExt)}.
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
    public void create_NamingContextExtHolder_NamingContextExt()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NamingContextExtHolder sut = null; // = new NamingContextExtHolder(NamingContextExt);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextExtHolder]

}
