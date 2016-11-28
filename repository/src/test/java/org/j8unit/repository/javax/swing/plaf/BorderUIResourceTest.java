package org.j8unit.repository.javax.swing.plaf;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.BorderUIResource.BevelBorderUIResource;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;
import javax.swing.plaf.BorderUIResource.EtchedBorderUIResource;
import javax.swing.plaf.BorderUIResource.LineBorderUIResource;
import javax.swing.plaf.BorderUIResource.MatteBorderUIResource;
import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BorderUIResource} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests}).
 */
@RunWith(J8Unit4.class)
public class BorderUIResourceTest
implements BorderUIResourceTests<BorderUIResource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource]

    @Override
    public BorderUIResource createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.BorderUIResource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TitledBorderUIResource} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.TitledBorderUIResourceTests}).
     */
    @RunWith(J8Unit4.class)
    public static class TitledBorderUIResourceTest
    implements TitledBorderUIResourceTests<TitledBorderUIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$TitledBorderUIResource]

        @Override
        public TitledBorderUIResource createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.BorderUIResource.TitledBorderUIResource], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$TitledBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$TitledBorderUIResource]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link EmptyBorderUIResource} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.EmptyBorderUIResourceTests}).
     */
    @RunWith(J8Unit4.class)
    public static class EmptyBorderUIResourceTest
    implements EmptyBorderUIResourceTests<EmptyBorderUIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EmptyBorderUIResource]

        @Override
        public EmptyBorderUIResource createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.BorderUIResource.EmptyBorderUIResource], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EmptyBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EmptyBorderUIResource]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link BevelBorderUIResource} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.BevelBorderUIResourceTests}).
     */
    @RunWith(J8Unit4.class)
    public static class BevelBorderUIResourceTest
    implements BevelBorderUIResourceTests<BevelBorderUIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$BevelBorderUIResource]

        @Override
        public BevelBorderUIResource createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.BorderUIResource.BevelBorderUIResource], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$BevelBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$BevelBorderUIResource]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link CompoundBorderUIResource} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.CompoundBorderUIResourceTests}).
     */
    @RunWith(J8Unit4.class)
    public static class CompoundBorderUIResourceTest
    implements CompoundBorderUIResourceTests<CompoundBorderUIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$CompoundBorderUIResource]

        @Override
        public CompoundBorderUIResource createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.BorderUIResource.CompoundBorderUIResource], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$CompoundBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$CompoundBorderUIResource]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link MatteBorderUIResource} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.MatteBorderUIResourceTests}).
     */
    @RunWith(J8Unit4.class)
    public static class MatteBorderUIResourceTest
    implements MatteBorderUIResourceTests<MatteBorderUIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$MatteBorderUIResource]

        @Override
        public MatteBorderUIResource createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.BorderUIResource.MatteBorderUIResource], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$MatteBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$MatteBorderUIResource]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class EtchedBorderUIResourceTest
    implements FactoryBasedJ8UnitTest<EtchedBorderUIResource>, EtchedBorderUIResourceTests<EtchedBorderUIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EtchedBorderUIResource]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(EtchedBorderUIResource::new);
        }

        @Parameter(0)
        public Callable<EtchedBorderUIResource> sutFactory;

        @Override
        public Callable<EtchedBorderUIResource> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EtchedBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$EtchedBorderUIResource]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link LineBorderUIResource} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.BorderUIResourceTests.LineBorderUIResourceTests}).
     */
    @RunWith(J8Unit4.class)
    public static class LineBorderUIResourceTest
    implements LineBorderUIResourceTests<LineBorderUIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$LineBorderUIResource]

        @Override
        public LineBorderUIResource createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.BorderUIResource.LineBorderUIResource], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$LineBorderUIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.BorderUIResource$LineBorderUIResource]

    }

}
