package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvokeHandlerClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.InvokeHandlerClassTests<org.omg.CORBA.portable.InvokeHandler> {

    @Override
    public Class<org.omg.CORBA.portable.InvokeHandler> createNewSUT() {
        return org.omg.CORBA.portable.InvokeHandler.class;
    }

}
