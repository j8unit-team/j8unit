package org.j8unit.runners.conformance;

import java.util.List;
import org.junit.AssumptionViolatedException;
import org.junit.Test;
import org.junit.runners.model.InitializationError;

/**
 * This is a pseudo junit4 test that is used to report some {@link APIConformance} internals.
 *
 * This class does not provide a zero-arity constructor; thus, it must be utilised as a
 * {@link org.junit.runners.parameterized.TestWithParameters}.
 *
 * @see APIConformance.ClassTestsDiscovery#ignoreMissings()
 * @see APIConformance.ClassTestsDiscovery#ignoreInvalids()
 * @see APIConformance.InstanceTestsDiscovery#ignoreMissings()
 * @see APIConformance.InstanceTestsDiscovery#ignoreInvalids()
 *
 * @since 4.12.2
 */
public class SummaryTest {

    private final List<? extends Throwable> missings;

    private final boolean ignoreMissings;

    private final List<? extends Throwable> malformeds;

    private final boolean ignoreMalformeds;

    public SummaryTest(final List<? extends Throwable> missings, final boolean ignoreMissings, final List<? extends Throwable> malformeds,
                       final boolean ignoreMalformeds) {
        this.missings = missings;
        this.ignoreMissings = ignoreMissings;
        this.malformeds = malformeds;
        this.ignoreMalformeds = ignoreMalformeds;
    }

    /**
     * <ul>
     * <li>Returns without any further notice if {@link #missings} is empty.</li>
     * <li>Throws an {@link AssumptionViolatedException} if {@link #missings} is not empty and {@link #ignoreMissings}
     * is {@code true}.</li>
     * <li>Throws an {@link InitializationError} if {@link #missings} is not empty and {@link #ignoreMissings} is
     * {@code false}.</li>
     * </ul>
     */
    @Test
    public void exploreJ8UnitTestInterfaces()
    throws Exception {
        if (!this.missings.isEmpty()) {
            final String msg = "Some of the expected J8Unit test interfaces could not be discovered!";
            final Exception failure = this.ignoreMissings ? new AssumptionViolatedException(msg) : new InitializationError(msg);
            this.missings.forEach(failure::addSuppressed);
            throw failure;
        }
    }

    /**
     * <ul>
     * <li>Returns without any further notice if {@link #malformeds} is empty.</li>
     * <li>Throws an {@link AssumptionViolatedException} if {@link #malformeds} is not empty and
     * {@link #ignoreMalformeds} is {@code true}.</li>
     * <li>Throws an {@link InitializationError} if {@link #malformeds} is not empty and {@link #ignoreMalformeds} is
     * {@code false}.</li>
     * </ul>
     */
    @Test
    public void instanciateJ8UnitTestInterfaces()
    throws Exception {
        if (!this.malformeds.isEmpty()) {
            final String msg = "Some of the expected J8Unit test interfaces could not be discovered!";
            final Exception failure = this.ignoreMalformeds ? new AssumptionViolatedException(msg) : new InitializationError(msg);
            this.malformeds.forEach(failure::addSuppressed);
            throw failure;
        }
    }

}
