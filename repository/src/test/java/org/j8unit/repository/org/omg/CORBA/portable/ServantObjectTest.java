package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantObjectTest
implements org.j8unit.repository.org.omg.CORBA.portable.ServantObjectTests<org.omg.CORBA.portable.ServantObject> {

    @Override
    public org.omg.CORBA.portable.ServantObject createNewSUT() {
        return new org.omg.CORBA.portable.ServantObject();
    }

}
