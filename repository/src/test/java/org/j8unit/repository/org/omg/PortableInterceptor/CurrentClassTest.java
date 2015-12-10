package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.CurrentClassTests<org.omg.PortableInterceptor.Current> {

    @Override
    public Class<org.omg.PortableInterceptor.Current> createNewSUT() {
        return org.omg.PortableInterceptor.Current.class;
    }

}
