package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.InitialDirContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialDirContextClassTest
implements org.j8unit.repository.javax.naming.directory.InitialDirContextClassTests<InitialDirContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.InitialDirContext]

    @Override
    public Class<InitialDirContext> createNewSUT() {
        return InitialDirContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.InitialDirContext#InitialDirContext() public
     * javax.naming.directory.InitialDirContext() throws javax.naming.NamingException}.
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
    public void create_InitialDirContext()
    throws Exception {
        // create new instance
        final InitialDirContext sut = new InitialDirContext();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.InitialDirContext#InitialDirContext(java.util.Hashtable) public
     * javax.naming.directory.InitialDirContext(java.util.Hashtable<?, ?>) throws javax.naming.NamingException}.
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
    public void create_InitialDirContext_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InitialDirContext sut = null; // = new InitialDirContext(java.util.Hashtable);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.InitialDirContext]

}
