package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSUnknownRule;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSUnknownRule} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSUnknownRuleClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSSUnknownRuleClassTest
implements CSSUnknownRuleClassTests<CSSUnknownRule> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSUnknownRule]

    @Override
    public Class<CSSUnknownRule> createNewSUT() {
        return CSSUnknownRule.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSUnknownRule]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSUnknownRule]

}
