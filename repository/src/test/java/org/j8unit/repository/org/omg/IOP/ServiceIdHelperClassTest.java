package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceIdHelperClassTest
implements org.j8unit.repository.org.omg.IOP.ServiceIdHelperClassTests<org.omg.IOP.ServiceIdHelper> {

    @Override
    public Class<org.omg.IOP.ServiceIdHelper> createNewSUT() {
        return org.omg.IOP.ServiceIdHelper.class;
    }

}
