package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuleBasedCollatorClassTest
implements org.j8unit.repository.java.text.RuleBasedCollatorClassTests<java.text.RuleBasedCollator> {

    @Override
    public Class<java.text.RuleBasedCollator> createNewSUT() {
        return java.text.RuleBasedCollator.class;
    }

}
