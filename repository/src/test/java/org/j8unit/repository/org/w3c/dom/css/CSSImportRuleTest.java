package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSSImportRule;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CSSImportRule} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSSImportRuleTests}).
 */
@RunWith(J8Unit4.class)
public class CSSImportRuleTest
implements CSSImportRuleTests<CSSImportRule> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.css.CSSImportRule]

    @Override
    public CSSImportRule createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.css.CSSImportRule], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.css.CSSImportRule]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.css.CSSImportRule]

}
