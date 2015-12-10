package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTMLDocumentClassTest
implements org.j8unit.repository.org.w3c.dom.html.HTMLDocumentClassTests<org.w3c.dom.html.HTMLDocument> {

    @Override
    public Class<org.w3c.dom.html.HTMLDocument> createNewSUT() {
        return org.w3c.dom.html.HTMLDocument.class;
    }

}
