package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INTF_REPOSTest
implements org.j8unit.repository.org.omg.CORBA.INTF_REPOSTests<org.omg.CORBA.INTF_REPOS> {

    @Override
    public org.omg.CORBA.INTF_REPOS createNewSUT() {
        return new org.omg.CORBA.INTF_REPOS();
    }

}
