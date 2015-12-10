package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantObjectClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ServantObjectClassTests<org.omg.CORBA.portable.ServantObject> {

    @Override
    public Class<org.omg.CORBA.portable.ServantObject> createNewSUT() {
        return org.omg.CORBA.portable.ServantObject.class;
    }

}
