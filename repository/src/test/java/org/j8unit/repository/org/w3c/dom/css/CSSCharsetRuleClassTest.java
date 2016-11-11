package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSCharsetRule;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSCharsetRule} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSCharsetRuleClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSSCharsetRuleClassTest
implements CSSCharsetRuleClassTests<CSSCharsetRule> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSCharsetRule]

    @Override
    public Class<CSSCharsetRule> createNewSUT() {
        return CSSCharsetRule.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSCharsetRule]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSCharsetRule]

}
