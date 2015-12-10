package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class PredicateClassTest
implements org.j8unit.repository.java.util.function.PredicateClassTests<java.util.function.Predicate> {

    @Override
    public Class<java.util.function.Predicate> createNewSUT() {
        return java.util.function.Predicate.class;
    }

}
