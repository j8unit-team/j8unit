package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.StubDelegate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StubDelegateClassTest
implements org.j8unit.repository.javax.rmi.CORBA.StubDelegateClassTests<StubDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.StubDelegate]

    @Override
    public Class<StubDelegate> createNewSUT() {
        return StubDelegate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.CORBA.StubDelegate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.StubDelegate]

}
