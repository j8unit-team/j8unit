package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAParams;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAParamsTest
implements org.j8unit.repository.java.security.interfaces.DSAParamsTests<DSAParams> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.DSAParams]

    @Override
    public DSAParams createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.DSAParams], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.DSAParams]

}
