package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECFieldClassTest
implements org.j8unit.repository.java.security.spec.ECFieldClassTests<java.security.spec.ECField> {

    @Override
    public Class<java.security.spec.ECField> createNewSUT() {
        return java.security.spec.ECField.class;
    }

}
