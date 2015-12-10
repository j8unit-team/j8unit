package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.ThreadPolicyValueTests<org.omg.PortableServer.ThreadPolicyValue> {

    @Override
    public org.omg.PortableServer.ThreadPolicyValue createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.omg.PortableServer.ThreadPolicyValue] available.");
    }

}
