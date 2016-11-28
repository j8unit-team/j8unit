package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAParams;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DSAParams} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.interfaces.DSAParamsClassTests}).
 */
@RunWith(J8Unit4.class)
public class DSAParamsClassTest
implements DSAParamsClassTests<DSAParams> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.DSAParams]

    @Override
    public Class<DSAParams> createNewSUT() {
        return DSAParams.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.DSAParams]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.DSAParams]

}
