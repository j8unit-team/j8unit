package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSMediaRule;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSMediaRule} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSMediaRuleClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSSMediaRuleClassTest
implements CSSMediaRuleClassTests<CSSMediaRule> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSMediaRule]

    @Override
    public Class<CSSMediaRule> createNewSUT() {
        return CSSMediaRule.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSMediaRule]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSMediaRule]

}
