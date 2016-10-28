package org.j8unit.repository.java.security.cert;

import java.security.cert.CRLReason;
import java.security.cert.CertificateRevokedException;
import java.util.Date;
import java.util.Map;
import javax.security.auth.x500.X500Principal;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CertificateRevokedExceptionClassTest
implements org.j8unit.repository.java.security.cert.CertificateRevokedExceptionClassTests<CertificateRevokedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertificateRevokedException]

    @Override
    public Class<CertificateRevokedException> createNewSUT() {
        return CertificateRevokedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link CertificateRevokedException#CertificateRevokedException(Date, CRLReason, X500Principal, Map) public
     * java.security.cert.CertificateRevokedException(java.util.Date,java.security.cert.CRLReason,javax.security.auth.x500.X500Principal,java.util.Map<java.lang.String,
     * java.security.cert.Extension>)}.
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
    public void create_CertificateRevokedException_Date_CRLReason_X500Principal_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertificateRevokedException sut = null; // = new CertificateRevokedException(Date, CRLReason,
                                                      // X500Principal, Map);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertificateRevokedException]

}
