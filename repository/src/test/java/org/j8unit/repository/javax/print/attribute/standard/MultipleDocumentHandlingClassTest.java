package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.MultipleDocumentHandling;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MultipleDocumentHandling} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.standard.MultipleDocumentHandlingClassTests}).
 */
@RunWith(J8Unit4.class)
public class MultipleDocumentHandlingClassTest
implements MultipleDocumentHandlingClassTests<MultipleDocumentHandling> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.MultipleDocumentHandling]

    @Override
    public Class<MultipleDocumentHandling> createNewSUT() {
        return MultipleDocumentHandling.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.MultipleDocumentHandling]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.MultipleDocumentHandling]

}
