package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectReferenceFactoryHolderTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceFactoryHolderTests<org.omg.PortableInterceptor.ObjectReferenceFactoryHolder> {

    @Override
    public org.omg.PortableInterceptor.ObjectReferenceFactoryHolder createNewSUT() {
        return new org.omg.PortableInterceptor.ObjectReferenceFactoryHolder();
    }

}
