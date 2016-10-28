package org.j8unit.repository.java.security;

import java.security.CodeSigner;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodeSignerClassTest
implements org.j8unit.repository.java.security.CodeSignerClassTests<CodeSigner> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.CodeSigner]

    @Override
    public Class<CodeSigner> createNewSUT() {
        return CodeSigner.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.CodeSigner#CodeSigner(java.security.cert.CertPath, java.security.Timestamp) public
     * java.security.CodeSigner(java.security.cert.CertPath,java.security.Timestamp)}.
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
    public void create_CodeSigner_CertPath_Timestamp()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CodeSigner sut = null; // = new CodeSigner(java.security.cert.CertPath, java.security.Timestamp);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.CodeSigner]

}
