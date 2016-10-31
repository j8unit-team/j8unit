package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Document;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentTest
implements org.j8unit.repository.javax.swing.text.DocumentTests<Document> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Document]

    @Override
    public Document createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Document], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Document]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Document]

}
