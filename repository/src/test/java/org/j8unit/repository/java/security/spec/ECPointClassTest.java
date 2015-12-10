package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPointClassTest
implements org.j8unit.repository.java.security.spec.ECPointClassTests<java.security.spec.ECPoint> {

    @Override
    public Class<java.security.spec.ECPoint> createNewSUT() {
        return java.security.spec.ECPoint.class;
    }

}
