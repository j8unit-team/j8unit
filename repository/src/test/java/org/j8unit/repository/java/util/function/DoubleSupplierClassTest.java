package org.j8unit.repository.java.util.function;

import java.util.function.DoubleSupplier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DoubleSupplier} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.DoubleSupplierClassTests}).
 */

@RunWith(J8Unit4.class)
public class DoubleSupplierClassTest
implements DoubleSupplierClassTests<DoubleSupplier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.DoubleSupplier]

    @Override
    public Class<DoubleSupplier> createNewSUT() {
        return DoubleSupplier.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.DoubleSupplier]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.DoubleSupplier]

}
