package org.j8unit.repository.org.ietf.jgss;

import java.io.InputStream;
import org.ietf.jgss.Oid;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OidClassTest
implements org.j8unit.repository.org.ietf.jgss.OidClassTests<Oid> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.Oid]

    @Override
    public Class<Oid> createNewSUT() {
        return Oid.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Oid#Oid(byte[]) public
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
     * Test method for the hereby targeted constructor-under-test {@link Oid#Oid(InputStream) public
     * org.ietf.jgss.Oid(java.io.InputStream) throws org.ietf.jgss.GSSException}.
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
        final Oid sut = null; // = new Oid(InputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Oid#Oid(String) public
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

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.Oid]

}
