package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OBJ_ADAPTERClassTest
implements org.j8unit.repository.org.omg.CORBA.OBJ_ADAPTERClassTests<org.omg.CORBA.OBJ_ADAPTER> {

    @Override
    public Class<org.omg.CORBA.OBJ_ADAPTER> createNewSUT() {
        return org.omg.CORBA.OBJ_ADAPTER.class;
    }

}
