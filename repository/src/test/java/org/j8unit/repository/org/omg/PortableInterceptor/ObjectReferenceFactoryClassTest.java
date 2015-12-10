package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectReferenceFactoryClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceFactoryClassTests<org.omg.PortableInterceptor.ObjectReferenceFactory> {

    @Override
    public Class<org.omg.PortableInterceptor.ObjectReferenceFactory> createNewSUT() {
        return org.omg.PortableInterceptor.ObjectReferenceFactory.class;
    }

}
