package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownUserExceptionHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.UnknownUserExceptionHelperClassTests<org.omg.CORBA.UnknownUserExceptionHelper> {

    @Override
    public Class<org.omg.CORBA.UnknownUserExceptionHelper> createNewSUT() {
        return org.omg.CORBA.UnknownUserExceptionHelper.class;
    }

}
