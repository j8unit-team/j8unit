package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSRuleList;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CSSRuleList} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSRuleListTests}).
 */
@RunWith(J8Unit4.class)
public class CSSRuleListTest
implements CSSRuleListTests<CSSRuleList> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.css.CSSRuleList]

    @Override
    public CSSRuleList createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.css.CSSRuleList], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.css.CSSRuleList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.css.CSSRuleList]

}
