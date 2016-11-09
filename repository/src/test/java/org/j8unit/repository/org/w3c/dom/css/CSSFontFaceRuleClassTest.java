package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSFontFaceRule;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSSFontFaceRule} (by simply reusing the
 * J8Unit test interface {@link CSSFontFaceRuleClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSSFontFaceRuleClassTest
implements CSSFontFaceRuleClassTests<CSSFontFaceRule> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSSFontFaceRule]

    @Override
    public Class<CSSFontFaceRule> createNewSUT() {
        return CSSFontFaceRule.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSSFontFaceRule]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSSFontFaceRule]

}
