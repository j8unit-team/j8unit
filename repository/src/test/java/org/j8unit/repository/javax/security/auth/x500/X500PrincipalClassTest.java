package org.j8unit.repository.javax.security.auth.x500;

import javax.security.auth.x500.X500Principal;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X500Principal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.x500.X500PrincipalClassTests}).
 */

@RunWith(J8Unit4.class)
public class X500PrincipalClassTest
implements X500PrincipalClassTests<X500Principal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.x500.X500Principal]

    @Override
    public Class<X500Principal> createNewSUT() {
        return X500Principal.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.x500.X500Principal#X500Principal(java.io.InputStream) public
     * javax.security.auth.x500.X500Principal(java.io.InputStream)}.
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
    public void create_X500Principal_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X500Principal sut = null; // = new X500Principal(java.io.InputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.x500.X500Principal#X500Principal(byte[]) public
     * javax.security.auth.x500.X500Principal(byte[])}.
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
    public void create_X500Principal_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X500Principal sut = null; // = new X500Principal(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.x500.X500Principal#X500Principal(String, java.util.Map) public
     * javax.security.auth.x500.X500Principal(java.lang.String,java.util.Map<java.lang.String, java.lang.String>)}.
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
    public void create_X500Principal_String_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X500Principal sut = null; // = new X500Principal(String, java.util.Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.x500.X500Principal#X500Principal(String) public
     * javax.security.auth.x500.X500Principal(java.lang.String)}.
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
    public void create_X500Principal_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final X500Principal sut = null; // = new X500Principal(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.x500.X500Principal]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.x500.X500Principal]

}
