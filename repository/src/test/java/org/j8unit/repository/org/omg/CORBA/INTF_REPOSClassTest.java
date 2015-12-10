package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INTF_REPOSClassTest
implements org.j8unit.repository.org.omg.CORBA.INTF_REPOSClassTests<org.omg.CORBA.INTF_REPOS> {

    @Override
    public Class<org.omg.CORBA.INTF_REPOS> createNewSUT() {
        return org.omg.CORBA.INTF_REPOS.class;
    }

}
