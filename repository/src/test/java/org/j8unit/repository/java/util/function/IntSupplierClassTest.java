package org.j8unit.repository.java.util.function;

import java.util.function.IntSupplier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntSupplier} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.function.IntSupplierClassTests}).
 */
@RunWith(J8Unit4.class)
public class IntSupplierClassTest
implements IntSupplierClassTests<IntSupplier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.IntSupplier]

    @Override
    public Class<IntSupplier> createNewSUT() {
        return IntSupplier.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.IntSupplier]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.IntSupplier]

}
