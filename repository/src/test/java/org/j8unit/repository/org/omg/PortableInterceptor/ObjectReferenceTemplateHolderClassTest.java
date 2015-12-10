package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectReferenceTemplateHolderClassTest
implements
org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceTemplateHolderClassTests<org.omg.PortableInterceptor.ObjectReferenceTemplateHolder> {

    @Override
    public Class<org.omg.PortableInterceptor.ObjectReferenceTemplateHolder> createNewSUT() {
        return org.omg.PortableInterceptor.ObjectReferenceTemplateHolder.class;
    }

}
