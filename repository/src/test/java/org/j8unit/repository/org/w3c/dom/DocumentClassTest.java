package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentClassTest
implements org.j8unit.repository.org.w3c.dom.DocumentClassTests<org.w3c.dom.Document> {

    @Override
    public Class<org.w3c.dom.Document> createNewSUT() {
        return org.w3c.dom.Document.class;
    }

}
