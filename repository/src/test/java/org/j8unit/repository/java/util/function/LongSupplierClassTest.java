package org.j8unit.repository.java.util.function;

import java.util.function.LongSupplier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongSupplierClassTest
implements org.j8unit.repository.java.util.function.LongSupplierClassTests<LongSupplier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongSupplier]

    @Override
    public Class<LongSupplier> createNewSUT() {
        return LongSupplier.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongSupplier]

}
