package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.css.ElementCSSInlineStyle;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ElementCSSInlineStyle} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.ElementCSSInlineStyleTests}).
 */
@RunWith(J8Unit4.class)
public class ElementCSSInlineStyleTest
implements ElementCSSInlineStyleTests<ElementCSSInlineStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.css.ElementCSSInlineStyle]

    @Override
    public ElementCSSInlineStyle createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.css.ElementCSSInlineStyle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.css.ElementCSSInlineStyle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.css.ElementCSSInlineStyle]

}
