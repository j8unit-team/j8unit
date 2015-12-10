package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INVALID_TRANSACTIONTest
implements org.j8unit.repository.org.omg.CORBA.INVALID_TRANSACTIONTests<org.omg.CORBA.INVALID_TRANSACTION> {

    @Override
    public org.omg.CORBA.INVALID_TRANSACTION createNewSUT() {
        return new org.omg.CORBA.INVALID_TRANSACTION();
    }

}
