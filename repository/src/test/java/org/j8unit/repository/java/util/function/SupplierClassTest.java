package org.j8unit.repository.java.util.function;

import java.util.function.Supplier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Supplier} (by simply reusing the J8Unit
 * test interface {@link SupplierClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SupplierClassTest
implements SupplierClassTests<Supplier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.Supplier]

    @Override
    public Class<Supplier> createNewSUT() {
        return Supplier.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.Supplier]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.Supplier]

}
