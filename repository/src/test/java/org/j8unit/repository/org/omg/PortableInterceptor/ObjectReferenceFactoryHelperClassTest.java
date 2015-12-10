package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectReferenceFactoryHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceFactoryHelperClassTests<org.omg.PortableInterceptor.ObjectReferenceFactoryHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.ObjectReferenceFactoryHelper> createNewSUT() {
        return org.omg.PortableInterceptor.ObjectReferenceFactoryHelper.class;
    }

}
