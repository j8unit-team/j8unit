package org.j8unit.repository.javax.activation;

import javax.activation.FileDataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileDataSourceTest
implements org.j8unit.repository.javax.activation.FileDataSourceTests<FileDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.FileDataSource]

    @Override
    public FileDataSource createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.activation.FileDataSource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.FileDataSource]

}
