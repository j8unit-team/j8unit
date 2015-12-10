package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DelegateClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.DelegateClassTests<org.omg.CORBA.portable.Delegate> {

    @Override
    public Class<org.omg.CORBA.portable.Delegate> createNewSUT() {
        return org.omg.CORBA.portable.Delegate.class;
    }

}
