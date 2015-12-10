package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectReferenceFactoryHolderClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceFactoryHolderClassTests<org.omg.PortableInterceptor.ObjectReferenceFactoryHolder> {

    @Override
    public Class<org.omg.PortableInterceptor.ObjectReferenceFactoryHolder> createNewSUT() {
        return org.omg.PortableInterceptor.ObjectReferenceFactoryHolder.class;
    }

}
