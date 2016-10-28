package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.JAXBPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBPermissionTest
implements org.j8unit.repository.javax.xml.bind.JAXBPermissionTests<JAXBPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBPermission]

    @Override
    public JAXBPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.bind.JAXBPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBPermission]

}
