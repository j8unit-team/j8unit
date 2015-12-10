package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSRuleClassTest
implements org.j8unit.repository.org.w3c.dom.css.CSSRuleClassTests<org.w3c.dom.css.CSSRule> {

    @Override
    public Class<org.w3c.dom.css.CSSRule> createNewSUT() {
        return org.w3c.dom.css.CSSRule.class;
    }

}
