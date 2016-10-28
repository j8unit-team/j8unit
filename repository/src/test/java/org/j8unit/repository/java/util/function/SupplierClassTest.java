package org.j8unit.repository.java.util.function;

import java.util.function.Supplier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SupplierClassTest
implements org.j8unit.repository.java.util.function.SupplierClassTests<Supplier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.Supplier]

    @Override
    public Class<Supplier> createNewSUT() {
        return Supplier.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.Supplier]

}
