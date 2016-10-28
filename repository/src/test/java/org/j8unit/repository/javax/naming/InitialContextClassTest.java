package org.j8unit.repository.javax.naming;

import javax.naming.InitialContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextClassTest
implements org.j8unit.repository.javax.naming.InitialContextClassTests<InitialContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.InitialContext]

    @Override
    public Class<InitialContext> createNewSUT() {
        return InitialContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.InitialContext#InitialContext(java.util.Hashtable) public
     * javax.naming.InitialContext(java.util.Hashtable<?, ?>) throws javax.naming.NamingException}.
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
    public void create_InitialContext_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InitialContext sut = null; // = new InitialContext(java.util.Hashtable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.naming.InitialContext#InitialContext()
     * public javax.naming.InitialContext() throws javax.naming.NamingException}.
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
    public void create_InitialContext()
    throws Exception {
        // create new instance
        final InitialContext sut = new InitialContext();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.naming.InitialContext#doLookup(javax.naming.Name) public static <T> T
     * javax.naming.InitialContext.doLookup(javax.naming.Name) throws javax.naming.NamingException}.
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
    public void test_doLookup_Name()
    throws Exception {
        // write some test for {@link javax.naming.InitialContext#doLookup(javax.naming.Name)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.naming.InitialContext#doLookup(String) public
     * static <T> T javax.naming.InitialContext.doLookup(java.lang.String) throws javax.naming.NamingException}.
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
    public void test_doLookup_String()
    throws Exception {
        // write some test for {@link javax.naming.InitialContext#doLookup(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.InitialContext]

}
