package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.RowFilter.Entry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class RowFilterTest<M, I>
implements org.j8unit.repository.javax.swing.RowFilterTests<RowFilter<M, I>, M, I> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RowFilter]

    @Override
    public RowFilter<M, I> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.RowFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RowFilter]

    @RunWith(J8Unit4.class)
    public static class EntryTest<M, I>
    implements org.j8unit.repository.javax.swing.RowFilterTests.EntryTests<Entry<M, I>, M, I> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RowFilter$Entry]

        @Override
        public Entry<M, I> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.RowFilter.Entry], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RowFilter$Entry]

    }

    @RunWith(J8Unit4.class)
    public static class ComparisonTypeTest
    implements org.j8unit.repository.javax.swing.RowFilterTests.ComparisonTypeTests<ComparisonType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RowFilter$ComparisonType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(ComparisonType.class);
        }

        @Parameter(0)
        public ComparisonType sut;

        @Override
        public ComparisonType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RowFilter$ComparisonType]

    }

}
