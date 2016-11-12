package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleStateSet;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class AccessibleStateSetBugs {

    @Test(expected = AssertionError.class)
    public void toStringReturnsNull() {
        final AccessibleStateSetTests<AccessibleStateSet> ass = AccessibleStateSet::new;
        ass.toStringMustReturnNotNull();
    }

}
