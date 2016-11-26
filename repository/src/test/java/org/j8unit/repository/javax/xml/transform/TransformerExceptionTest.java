package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.TransformerException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TransformerException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.TransformerExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class TransformerExceptionTest
implements TransformerExceptionTests<TransformerException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.TransformerException]

    @Override
    public TransformerException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.transform.TransformerException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.TransformerException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.TransformerException]

}
