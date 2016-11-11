package org.j8unit.repository.javax.security.auth.kerberos;

import javax.security.auth.kerberos.KerberosPrincipal;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KerberosPrincipal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.kerberos.KerberosPrincipalClassTests}).
 */

@RunWith(J8Unit4.class)
public class KerberosPrincipalClassTest
implements KerberosPrincipalClassTests<KerberosPrincipal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.kerberos.KerberosPrincipal]

    @Override
    public Class<KerberosPrincipal> createNewSUT() {
        return KerberosPrincipal.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.kerberos.KerberosPrincipal#KerberosPrincipal(String) public
     * javax.security.auth.kerberos.KerberosPrincipal(java.lang.String)}.
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
    public void create_KerberosPrincipal_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KerberosPrincipal sut = null; // = new KerberosPrincipal(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.kerberos.KerberosPrincipal#KerberosPrincipal(String, int) public
     * javax.security.auth.kerberos.KerberosPrincipal(java.lang.String,int)}.
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
    public void create_KerberosPrincipal_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final KerberosPrincipal sut = null; // = new KerberosPrincipal(String, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.kerberos.KerberosPrincipal]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.kerberos.KerberosPrincipal]

}
