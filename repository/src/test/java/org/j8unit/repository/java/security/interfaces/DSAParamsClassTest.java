package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAParamsClassTest
implements org.j8unit.repository.java.security.interfaces.DSAParamsClassTests<java.security.interfaces.DSAParams> {

    @Override
    public Class<java.security.interfaces.DSAParams> createNewSUT() {
        return java.security.interfaces.DSAParams.class;
    }

}
