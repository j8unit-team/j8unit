package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.QualifiedNameable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link QualifiedNameable} (by simply reusing the
 * J8Unit test interface {@link QualifiedNameableClassTests}).
 */

@RunWith(J8Unit4.class)
public class QualifiedNameableClassTest
implements QualifiedNameableClassTests<QualifiedNameable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.QualifiedNameable]

    @Override
    public Class<QualifiedNameable> createNewSUT() {
        return QualifiedNameable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.QualifiedNameable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.QualifiedNameable]

}
