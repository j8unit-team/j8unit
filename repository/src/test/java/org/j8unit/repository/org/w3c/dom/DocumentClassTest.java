package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

@RunWith(J8Unit4.class)
public class DocumentClassTest
implements org.j8unit.repository.org.w3c.dom.DocumentClassTests<Document> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Document]

    @Override
    public Class<Document> createNewSUT() {
        return Document.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Document]

}
