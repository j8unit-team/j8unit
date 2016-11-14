package org.j8unit.repository.javax.swing.text;

import javax.swing.text.StyledDocument;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StyledDocument} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.StyledDocumentClassTests}).
 */

@RunWith(J8Unit4.class)
public class StyledDocumentClassTest
implements StyledDocumentClassTests<StyledDocument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledDocument]

    @Override
    public Class<StyledDocument> createNewSUT() {
        return StyledDocument.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledDocument]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledDocument]

}
