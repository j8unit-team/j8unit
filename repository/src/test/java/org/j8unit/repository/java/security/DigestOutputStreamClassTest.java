package org.j8unit.repository.java.security;

import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DigestOutputStreamClassTest
implements org.j8unit.repository.java.security.DigestOutputStreamClassTests<DigestOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.DigestOutputStream]

    @Override
    public Class<DigestOutputStream> createNewSUT() {
        return DigestOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link DigestOutputStream#DigestOutputStream(OutputStream, MessageDigest) public
     * java.security.DigestOutputStream(java.io.OutputStream,java.security.MessageDigest)}.
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
    public void create_DigestOutputStream_OutputStream_MessageDigest()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DigestOutputStream sut = null; // = new DigestOutputStream(OutputStream, MessageDigest);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.DigestOutputStream]

}
