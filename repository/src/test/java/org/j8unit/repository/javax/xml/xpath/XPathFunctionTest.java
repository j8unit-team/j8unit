package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XPathFunction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.xpath.XPathFunctionTests}).
 */
@RunWith(J8Unit4.class)
public class XPathFunctionTest
implements XPathFunctionTests<XPathFunction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.xpath.XPathFunction]

    @Override
    public XPathFunction createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.xpath.XPathFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.xpath.XPathFunction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.xpath.XPathFunction]

}
