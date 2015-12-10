package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsatisfiedLinkErrorClassTest
implements org.j8unit.repository.java.lang.UnsatisfiedLinkErrorClassTests<java.lang.UnsatisfiedLinkError> {

    @Override
    public Class<java.lang.UnsatisfiedLinkError> createNewSUT() {
        return java.lang.UnsatisfiedLinkError.class;
    }

}
