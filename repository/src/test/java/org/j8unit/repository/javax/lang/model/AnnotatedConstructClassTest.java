package org.j8unit.repository.javax.lang.model;

import javax.lang.model.AnnotatedConstruct;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AnnotatedConstruct} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.AnnotatedConstructClassTests}).
 */

@RunWith(J8Unit4.class)
public class AnnotatedConstructClassTest
implements AnnotatedConstructClassTests<AnnotatedConstruct> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.AnnotatedConstruct]

    @Override
    public Class<AnnotatedConstruct> createNewSUT() {
        return AnnotatedConstruct.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.AnnotatedConstruct]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.AnnotatedConstruct]

}
