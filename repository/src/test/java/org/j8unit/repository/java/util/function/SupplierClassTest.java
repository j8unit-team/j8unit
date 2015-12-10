package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SupplierClassTest
implements org.j8unit.repository.java.util.function.SupplierClassTests<java.util.function.Supplier> {

    @Override
    public Class<java.util.function.Supplier> createNewSUT() {
        return java.util.function.Supplier.class;
    }

}
