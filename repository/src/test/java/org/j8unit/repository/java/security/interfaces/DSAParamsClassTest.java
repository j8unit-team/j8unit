package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAParams;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAParamsClassTest
implements org.j8unit.repository.java.security.interfaces.DSAParamsClassTests<DSAParams> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.DSAParams]

    @Override
    public Class<DSAParams> createNewSUT() {
        return DSAParams.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.DSAParams]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.DSAParams]

}
