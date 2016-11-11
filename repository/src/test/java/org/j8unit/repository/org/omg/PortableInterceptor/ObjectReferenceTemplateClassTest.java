package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ObjectReferenceTemplate;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectReferenceTemplate} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceTemplateClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectReferenceTemplateClassTest
implements ObjectReferenceTemplateClassTests<ObjectReferenceTemplate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceTemplate]

    @Override
    public Class<ObjectReferenceTemplate> createNewSUT() {
        return ObjectReferenceTemplate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceTemplate]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceTemplate]

}
