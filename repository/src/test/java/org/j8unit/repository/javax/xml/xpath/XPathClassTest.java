package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPath;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XPath} (by simply reusing the J8Unit test
 * interface {@link XPathClassTests}).
 */

@RunWith(J8Unit4.class)
public class XPathClassTest
implements XPathClassTests<XPath> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.xpath.XPath]

    @Override
    public Class<XPath> createNewSUT() {
        return XPath.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.xpath.XPath]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.xpath.XPath]

}
