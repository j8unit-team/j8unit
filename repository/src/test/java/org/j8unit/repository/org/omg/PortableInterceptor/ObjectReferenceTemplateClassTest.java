package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectReferenceTemplateClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceTemplateClassTests<org.omg.PortableInterceptor.ObjectReferenceTemplate> {

    @Override
    public Class<org.omg.PortableInterceptor.ObjectReferenceTemplate> createNewSUT() {
        return org.omg.PortableInterceptor.ObjectReferenceTemplate.class;
    }

}
