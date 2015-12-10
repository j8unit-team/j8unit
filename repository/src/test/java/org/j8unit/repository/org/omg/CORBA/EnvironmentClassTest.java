package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EnvironmentClassTest
implements org.j8unit.repository.org.omg.CORBA.EnvironmentClassTests<org.omg.CORBA.Environment> {

    @Override
    public Class<org.omg.CORBA.Environment> createNewSUT() {
        return org.omg.CORBA.Environment.class;
    }

}
