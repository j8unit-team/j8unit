package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PlainDocumentClassTest
implements org.j8unit.repository.javax.swing.text.PlainDocumentClassTests<javax.swing.text.PlainDocument> {

    @Override
    public Class<javax.swing.text.PlainDocument> createNewSUT() {
        return javax.swing.text.PlainDocument.class;
    }

}
