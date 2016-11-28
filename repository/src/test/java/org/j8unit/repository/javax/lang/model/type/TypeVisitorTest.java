package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.TypeVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TypeVisitor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.TypeVisitorTests}).
 */
@RunWith(J8Unit4.class)
public class TypeVisitorTest<R, P>
implements TypeVisitorTests<TypeVisitor<R, P>, R, P> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.TypeVisitor]

    @Override
    public TypeVisitor<R, P> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.TypeVisitor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.TypeVisitor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.TypeVisitor]

}
