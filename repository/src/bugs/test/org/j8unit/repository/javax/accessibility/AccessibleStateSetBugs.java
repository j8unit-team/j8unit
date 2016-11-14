package org.j8unit.repository.javax.accessibility;

import static org.junit.Assert.assertNotNull;
import javax.accessibility.AccessibleStateSet;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class AccessibleStateSetBugs {

    @Test(expected = AssertionError.class /* because there is a bug! */)
    public void toStringReturnsNull() {
        final AccessibleStateSet instance = new AccessibleStateSet();
        assertNotNull(null, instance.toString());
    }

}
