package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SUCCESSFULClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.SUCCESSFULClassTests<org.omg.PortableInterceptor.SUCCESSFUL> {

    @Override
    public Class<org.omg.PortableInterceptor.SUCCESSFUL> createNewSUT() {
        return org.omg.PortableInterceptor.SUCCESSFUL.class;
    }

}
