package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPath;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XPath} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.xpath.XPathTests}).
 */

@RunWith(J8Unit4.class)
public class XPathTest
implements XPathTests<XPath> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.xpath.XPath]

    @Override
    public XPath createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.xpath.XPath], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.xpath.XPath]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.xpath.XPath]

}
