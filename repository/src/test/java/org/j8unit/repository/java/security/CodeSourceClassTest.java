package org.j8unit.repository.java.security;

import java.net.URL;
import java.security.CodeSigner;
import java.security.CodeSource;
import java.security.cert.Certificate;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodeSourceClassTest
implements org.j8unit.repository.java.security.CodeSourceClassTests<CodeSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.CodeSource]

    @Override
    public Class<CodeSource> createNewSUT() {
        return CodeSource.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link CodeSource#CodeSource(URL, Certificate[])
     * public java.security.CodeSource(java.net.URL,java.security.cert.Certificate[])}.
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
    public void create_CodeSource_URL_CertificateArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CodeSource sut = null; // = new CodeSource(URL, Certificate[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link CodeSource#CodeSource(URL, CodeSigner[]) public
     * java.security.CodeSource(java.net.URL,java.security.CodeSigner[])}.
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
    public void create_CodeSource_URL_CodeSignerArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CodeSource sut = null; // = new CodeSource(URL, CodeSigner[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.CodeSource]

}
