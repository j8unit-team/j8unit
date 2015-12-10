package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectImplClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ObjectImplClassTests<org.omg.CORBA.portable.ObjectImpl> {

    @Override
    public Class<org.omg.CORBA.portable.ObjectImpl> createNewSUT() {
        return org.omg.CORBA.portable.ObjectImpl.class;
    }

}
