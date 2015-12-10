package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.CurrentHelperClassTests<org.omg.PortableInterceptor.CurrentHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.CurrentHelper> createNewSUT() {
        return org.omg.PortableInterceptor.CurrentHelper.class;
    }

}
