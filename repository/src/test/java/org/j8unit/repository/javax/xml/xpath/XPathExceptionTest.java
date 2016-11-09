package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XPathException} (by simply reusing
 * the J8Unit test interface {@link XPathExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class XPathExceptionTest
implements XPathExceptionTests<XPathException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.xpath.XPathException]

    @Override
    public XPathException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.xpath.XPathException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.xpath.XPathException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.xpath.XPathException]

}
