package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSlotHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.InvalidSlotHelperClassTests<org.omg.PortableInterceptor.InvalidSlotHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.InvalidSlotHelper> createNewSUT() {
        return org.omg.PortableInterceptor.InvalidSlotHelper.class;
    }

}
