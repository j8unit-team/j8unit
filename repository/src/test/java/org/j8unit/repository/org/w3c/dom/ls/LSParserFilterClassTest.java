package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSParserFilter;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSParserFilter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSParserFilterClassTests}).
 */

@RunWith(J8Unit4.class)
public class LSParserFilterClassTest
implements LSParserFilterClassTests<LSParserFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSParserFilter]

    @Override
    public Class<LSParserFilter> createNewSUT() {
        return LSParserFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSParserFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSParserFilter]

}
