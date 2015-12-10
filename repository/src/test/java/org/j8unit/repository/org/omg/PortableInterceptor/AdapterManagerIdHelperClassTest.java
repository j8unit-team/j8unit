package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterManagerIdHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.AdapterManagerIdHelperClassTests<org.omg.PortableInterceptor.AdapterManagerIdHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.AdapterManagerIdHelper> createNewSUT() {
        return org.omg.PortableInterceptor.AdapterManagerIdHelper.class;
    }

}
