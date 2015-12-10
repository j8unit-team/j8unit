package org.j8unit.repository.org.omg.PortableServer.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DelegateClassTest
implements org.j8unit.repository.org.omg.PortableServer.portable.DelegateClassTests<org.omg.PortableServer.portable.Delegate> {

    @Override
    public Class<org.omg.PortableServer.portable.Delegate> createNewSUT() {
        return org.omg.PortableServer.portable.Delegate.class;
    }

}
