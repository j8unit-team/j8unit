package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OptionalTest<T>
implements org.j8unit.repository.java.util.OptionalTests<java.util.Optional<T>, T> {

    @Override
    public java.util.Optional<T> createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.util.Optional] available.");
    }

}
