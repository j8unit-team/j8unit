package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.UtilDelegate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UtilDelegate} (by simply reusing the
 * J8Unit test interface {@link UtilDelegateClassTests}).
 */

@RunWith(J8Unit4.class)
public class UtilDelegateClassTest
implements UtilDelegateClassTests<UtilDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.UtilDelegate]

    @Override
    public Class<UtilDelegate> createNewSUT() {
        return UtilDelegate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.CORBA.UtilDelegate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.UtilDelegate]

}
