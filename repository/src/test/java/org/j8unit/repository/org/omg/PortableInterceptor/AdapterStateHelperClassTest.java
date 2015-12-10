package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterStateHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.AdapterStateHelperClassTests<org.omg.PortableInterceptor.AdapterStateHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.AdapterStateHelper> createNewSUT() {
        return org.omg.PortableInterceptor.AdapterStateHelper.class;
    }

}
