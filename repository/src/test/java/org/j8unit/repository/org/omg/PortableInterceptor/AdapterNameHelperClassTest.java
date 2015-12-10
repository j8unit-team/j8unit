package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterNameHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.AdapterNameHelperClassTests<org.omg.PortableInterceptor.AdapterNameHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.AdapterNameHelper> createNewSUT() {
        return org.omg.PortableInterceptor.AdapterNameHelper.class;
    }

}
