package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OBJECT_NOT_EXISTClassTest
implements org.j8unit.repository.org.omg.CORBA.OBJECT_NOT_EXISTClassTests<org.omg.CORBA.OBJECT_NOT_EXIST> {

    @Override
    public Class<org.omg.CORBA.OBJECT_NOT_EXIST> createNewSUT() {
        return org.omg.CORBA.OBJECT_NOT_EXIST.class;
    }

}
