package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectReferenceTemplateHolderTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceTemplateHolderTests<org.omg.PortableInterceptor.ObjectReferenceTemplateHolder> {

    @Override
    public org.omg.PortableInterceptor.ObjectReferenceTemplateHolder createNewSUT() {
        return new org.omg.PortableInterceptor.ObjectReferenceTemplateHolder();
    }

}
