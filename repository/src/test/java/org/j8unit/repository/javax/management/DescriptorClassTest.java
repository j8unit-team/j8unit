package org.j8unit.repository.javax.management;

import javax.management.Descriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Descriptor} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.management.DescriptorClassTests}).
 */
@RunWith(J8Unit4.class)
public class DescriptorClassTest
implements DescriptorClassTests<Descriptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.Descriptor]

    @Override
    public Class<Descriptor> createNewSUT() {
        return Descriptor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.Descriptor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.Descriptor]

}
