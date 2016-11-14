package org.j8unit.repository.java.util.function;

import java.util.function.BooleanSupplier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BooleanSupplier} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.BooleanSupplierClassTests}).
 */

@RunWith(J8Unit4.class)
public class BooleanSupplierClassTest
implements BooleanSupplierClassTests<BooleanSupplier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.BooleanSupplier]

    @Override
    public Class<BooleanSupplier> createNewSUT() {
        return BooleanSupplier.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.BooleanSupplier]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.BooleanSupplier]

}
