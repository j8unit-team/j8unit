package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSRuleList;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSRuleList} (by simply reusing the
 * J8Unit test interface {@link CSSRuleListClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSSRuleListClassTest
implements CSSRuleListClassTests<CSSRuleList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSRuleList]

    @Override
    public Class<CSSRuleList> createNewSUT() {
        return CSSRuleList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSRuleList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSRuleList]

}
