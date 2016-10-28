package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.EntityReference;

@RunWith(J8Unit4.class)
public class EntityReferenceClassTest
implements org.j8unit.repository.org.w3c.dom.EntityReferenceClassTests<EntityReference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.EntityReference]

    @Override
    public Class<EntityReference> createNewSUT() {
        return EntityReference.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.EntityReference]

}
