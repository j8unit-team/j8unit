package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EntityReferenceClassTest
implements org.j8unit.repository.org.w3c.dom.EntityReferenceClassTests<org.w3c.dom.EntityReference> {

    @Override
    public Class<org.w3c.dom.EntityReference> createNewSUT() {
        return org.w3c.dom.EntityReference.class;
    }

}
