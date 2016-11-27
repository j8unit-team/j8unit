package org.j8unit.repository.javax.management;

import static org.junit.Assert.assertNotNull;
import javax.management.AttributeValueExp;
import org.junit.Test;

/**
 * @since 0.9.4
 */
@SuppressWarnings("deprecation")
public class AttributeValueExpBugs {

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void toStringReturnsNull() {
        final AttributeValueExp instance = new AttributeValueExp();
        assertNotNull(null, instance.toString());
    }

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void toStringReturnsNull2() {
        final AttributeValueExp instance = new AttributeValueExp(null);
        assertNotNull(null, instance.toString());
    }

}
