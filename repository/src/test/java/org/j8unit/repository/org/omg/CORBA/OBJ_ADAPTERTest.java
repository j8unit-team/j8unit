package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OBJ_ADAPTERTest
implements org.j8unit.repository.org.omg.CORBA.OBJ_ADAPTERTests<org.omg.CORBA.OBJ_ADAPTER> {

    @Override
    public org.omg.CORBA.OBJ_ADAPTER createNewSUT() {
        return new org.omg.CORBA.OBJ_ADAPTER();
    }

}
