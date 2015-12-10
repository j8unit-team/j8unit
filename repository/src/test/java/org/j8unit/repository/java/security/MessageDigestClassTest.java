package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessageDigestClassTest
implements org.j8unit.repository.java.security.MessageDigestClassTests<java.security.MessageDigest> {

    @Override
    public Class<java.security.MessageDigest> createNewSUT() {
        return java.security.MessageDigest.class;
    }

}
