package org.j8unit.repository.java.util.function;

import java.util.function.BooleanSupplier;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BooleanSupplier} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.function.BooleanSupplierTests}).
 */
@RunWith(J8Unit4.class)
public class BooleanSupplierTest
implements BooleanSupplierTests<BooleanSupplier> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.BooleanSupplier]

    @Override
    public BooleanSupplier createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.BooleanSupplier], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.BooleanSupplier]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.BooleanSupplier]

}
