package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseHandlerClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ResponseHandlerClassTests<org.omg.CORBA.portable.ResponseHandler> {

    @Override
    public Class<org.omg.CORBA.portable.ResponseHandler> createNewSUT() {
        return org.omg.CORBA.portable.ResponseHandler.class;
    }

}
