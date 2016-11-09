package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSStyleRule;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSStyleRule} (by simply reusing the
 * J8Unit test interface {@link CSSStyleRuleClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSSStyleRuleClassTest
implements CSSStyleRuleClassTests<CSSStyleRule> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSStyleRule]

    @Override
    public Class<CSSStyleRule> createNewSUT() {
        return CSSStyleRule.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSStyleRule]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSStyleRule]

}
