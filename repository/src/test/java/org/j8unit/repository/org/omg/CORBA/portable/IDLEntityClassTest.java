package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IDLEntityClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.IDLEntityClassTests<org.omg.CORBA.portable.IDLEntity> {

    @Override
    public Class<org.omg.CORBA.portable.IDLEntity> createNewSUT() {
        return org.omg.CORBA.portable.IDLEntity.class;
    }

}
