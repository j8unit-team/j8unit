package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.CTX_RESTRICT_SCOPE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CTX_RESTRICT_SCOPE} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.CTX_RESTRICT_SCOPEClassTests}).
 */

@RunWith(J8Unit4.class)
public class CTX_RESTRICT_SCOPEClassTest
implements CTX_RESTRICT_SCOPEClassTests<CTX_RESTRICT_SCOPE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.CTX_RESTRICT_SCOPE]

    @Override
    public Class<CTX_RESTRICT_SCOPE> createNewSUT() {
        return CTX_RESTRICT_SCOPE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.CTX_RESTRICT_SCOPE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.CTX_RESTRICT_SCOPE]

}
