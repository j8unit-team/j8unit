package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.NameDynAnyPairSeqHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NameDynAnyPairSeqHelper} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.NameDynAnyPairSeqHelperTests}).
 */
@RunWith(J8Unit4.class)
public class NameDynAnyPairSeqHelperTest
implements NameDynAnyPairSeqHelperTests<NameDynAnyPairSeqHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.NameDynAnyPairSeqHelper]

    @Override
    public NameDynAnyPairSeqHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.NameDynAnyPairSeqHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.NameDynAnyPairSeqHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.NameDynAnyPairSeqHelper]

}
