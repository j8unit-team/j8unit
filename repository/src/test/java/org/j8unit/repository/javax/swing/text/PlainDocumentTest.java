package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PlainDocumentTest
implements org.j8unit.repository.javax.swing.text.PlainDocumentTests<javax.swing.text.PlainDocument> {

    @Override
    public javax.swing.text.PlainDocument createNewSUT() {
        return new javax.swing.text.PlainDocument();
    }

}
