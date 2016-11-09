package org.j8unit.repository.javax.management;

import javax.management.DescriptorRead;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DescriptorRead} (by simply reusing the
 * J8Unit test interface {@link DescriptorReadClassTests}).
 */

@RunWith(J8Unit4.class)
public class DescriptorReadClassTest
implements DescriptorReadClassTests<DescriptorRead> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.DescriptorRead]

    @Override
    public Class<DescriptorRead> createNewSUT() {
        return DescriptorRead.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.DescriptorRead]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.DescriptorRead]

}
