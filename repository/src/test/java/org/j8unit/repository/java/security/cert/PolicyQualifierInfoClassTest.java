package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyQualifierInfoClassTest
implements org.j8unit.repository.java.security.cert.PolicyQualifierInfoClassTests<java.security.cert.PolicyQualifierInfo> {

    @Override
    public Class<java.security.cert.PolicyQualifierInfo> createNewSUT() {
        return java.security.cert.PolicyQualifierInfo.class;
    }

}
