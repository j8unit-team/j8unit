package org.j8unit.repository.javax.management;

import javax.management.AttributeValueExp;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class AttributeValueExpBugs {

    @Test(expected = AssertionError.class)
    public void toStringReturnsNull() {
        final AttributeValueExpTests<AttributeValueExp> ave = AttributeValueExp::new;
        ave.toStringMustReturnNotNull();
    }

    @Test(expected = AssertionError.class)
    public void toStringReturnsNull2() {
        final AttributeValueExpTests<AttributeValueExp> ave = () -> new AttributeValueExp(null);
        ave.toStringMustReturnNotNull();
    }

}
