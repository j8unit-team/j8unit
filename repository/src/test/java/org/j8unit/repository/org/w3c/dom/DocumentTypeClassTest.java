package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentTypeClassTest
implements org.j8unit.repository.org.w3c.dom.DocumentTypeClassTests<org.w3c.dom.DocumentType> {

    @Override
    public Class<org.w3c.dom.DocumentType> createNewSUT() {
        return org.w3c.dom.DocumentType.class;
    }

}
