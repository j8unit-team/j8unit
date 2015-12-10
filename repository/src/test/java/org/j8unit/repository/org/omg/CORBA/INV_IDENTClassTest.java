package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INV_IDENTClassTest
implements org.j8unit.repository.org.omg.CORBA.INV_IDENTClassTests<org.omg.CORBA.INV_IDENT> {

    @Override
    public Class<org.omg.CORBA.INV_IDENT> createNewSUT() {
        return org.omg.CORBA.INV_IDENT.class;
    }

}
