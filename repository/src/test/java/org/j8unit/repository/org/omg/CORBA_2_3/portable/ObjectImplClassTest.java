package org.j8unit.repository.org.omg.CORBA_2_3.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectImplClassTest
implements org.j8unit.repository.org.omg.CORBA_2_3.portable.ObjectImplClassTests<org.omg.CORBA_2_3.portable.ObjectImpl> {

    @Override
    public Class<org.omg.CORBA_2_3.portable.ObjectImpl> createNewSUT() {
        return org.omg.CORBA_2_3.portable.ObjectImpl.class;
    }

}
