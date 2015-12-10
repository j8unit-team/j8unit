package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VerifyErrorClassTest
implements org.j8unit.repository.java.lang.VerifyErrorClassTests<java.lang.VerifyError> {

    @Override
    public Class<java.lang.VerifyError> createNewSUT() {
        return java.lang.VerifyError.class;
    }

}
