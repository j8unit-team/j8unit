package org.j8unit.repository.java.util.function;

import java.util.function.LongSupplier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongSupplier} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.LongSupplierClassTests}).
 */

@RunWith(J8Unit4.class)
public class LongSupplierClassTest
implements LongSupplierClassTests<LongSupplier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongSupplier]

    @Override
    public Class<LongSupplier> createNewSUT() {
        return LongSupplier.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongSupplier]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongSupplier]

}
