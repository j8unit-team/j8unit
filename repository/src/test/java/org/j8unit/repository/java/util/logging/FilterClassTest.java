package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilterClassTest
implements org.j8unit.repository.java.util.logging.FilterClassTests<java.util.logging.Filter> {

    @Override
    public Class<java.util.logging.Filter> createNewSUT() {
        return java.util.logging.Filter.class;
    }

}
