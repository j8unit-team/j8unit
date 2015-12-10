package org.j8unit.repository.org.omg.CORBA_2_3.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DelegateClassTest
implements org.j8unit.repository.org.omg.CORBA_2_3.portable.DelegateClassTests<org.omg.CORBA_2_3.portable.Delegate> {

    @Override
    public Class<org.omg.CORBA_2_3.portable.Delegate> createNewSUT() {
        return org.omg.CORBA_2_3.portable.Delegate.class;
    }

}
