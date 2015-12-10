package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSSMediaRuleClassTest
implements org.j8unit.repository.org.w3c.dom.css.CSSMediaRuleClassTests<org.w3c.dom.css.CSSMediaRule> {

    @Override
    public Class<org.w3c.dom.css.CSSMediaRule> createNewSUT() {
        return org.w3c.dom.css.CSSMediaRule.class;
    }

}
