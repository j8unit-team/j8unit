package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSStyleRuleClassTest
implements org.j8unit.repository.org.w3c.dom.css.CSSStyleRuleClassTests<org.w3c.dom.css.CSSStyleRule> {

    @Override
    public Class<org.w3c.dom.css.CSSStyleRule> createNewSUT() {
        return org.w3c.dom.css.CSSStyleRule.class;
    }

}
