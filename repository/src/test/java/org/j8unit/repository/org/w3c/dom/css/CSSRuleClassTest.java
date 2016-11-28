package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSRule;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSRule} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSRuleClassTests}).
 */
@RunWith(J8Unit4.class)
public class CSSRuleClassTest
implements CSSRuleClassTests<CSSRule> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSRule]

    @Override
    public Class<CSSRule> createNewSUT() {
        return CSSRule.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSRule]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSRule]

}
