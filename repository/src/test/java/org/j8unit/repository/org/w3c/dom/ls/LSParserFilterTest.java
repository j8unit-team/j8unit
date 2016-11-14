package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSParserFilter;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LSParserFilter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSParserFilterTests}).
 */

@RunWith(J8Unit4.class)
public class LSParserFilterTest
implements LSParserFilterTests<LSParserFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.ls.LSParserFilter]

    @Override
    public LSParserFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.ls.LSParserFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.ls.LSParserFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.ls.LSParserFilter]

}
