package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.Oid;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Oid} (by simply reusing the J8Unit test
 * interface {@link OidClassTests}).
 */

@RunWith(J8Unit4.class)
public class OidClassTest
implements OidClassTests<Oid> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.Oid]

    @Override
    public Class<Oid> createNewSUT() {
        return Oid.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.ietf.jgss.Oid#Oid(String) public
     * org.ietf.jgss.Oid(java.lang.String) throws org.ietf.jgss.GSSException}.
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
    public void create_Oid_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Oid sut = null; // = new Oid(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.ietf.jgss.Oid#Oid(byte[]) public
     * org.ietf.jgss.Oid(byte[]) throws org.ietf.jgss.GSSException}.
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
    public void create_Oid_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Oid sut = null; // = new Oid(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.ietf.jgss.Oid#Oid(java.io.InputStream)
     * public org.ietf.jgss.Oid(java.io.InputStream) throws org.ietf.jgss.GSSException}.
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
    public void create_Oid_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Oid sut = null; // = new Oid(java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.Oid]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.Oid]

}
