package org.j8unit.repository.javax.activation;

import javax.activation.URLDataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLDataSourceTest
implements org.j8unit.repository.javax.activation.URLDataSourceTests<URLDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.URLDataSource]

    @Override
    public URLDataSource createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.activation.URLDataSource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.URLDataSource]

}
