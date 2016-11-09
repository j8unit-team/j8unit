package org.j8unit.repository.javax.xml.crypto.dsig.dom;

import javax.xml.crypto.dsig.dom.DOMValidateContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMValidateContext} (by simply
 * reusing the J8Unit test interface {@link DOMValidateContextTests}).
 */

@RunWith(J8Unit4.class)
public class DOMValidateContextTest
implements DOMValidateContextTests<DOMValidateContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMValidateContext]

    @Override
    public DOMValidateContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.crypto.dsig.dom.DOMValidateContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMValidateContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMValidateContext]

}
