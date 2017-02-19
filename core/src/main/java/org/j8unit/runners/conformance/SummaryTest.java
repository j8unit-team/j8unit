package org.j8unit.runners.conformance;

import java.util.List;
import org.junit.AssumptionViolatedException;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.model.InitializationError;

/**
 * This is a pseudo junit4 test that is used to report some {@link APIConformance} internals.
 *
 * This class requires four {@link Parameter}s, thus, it must be used as a
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

    @Parameter(0)
    public List<? extends Throwable> missings;

    @Parameter(1)
    public boolean ignoreMissings;

    @Parameter(2)
    public List<? extends Throwable> malformeds;

    @Parameter(3)
    public boolean ignoreMalformeds;

    /**
     * <ul>
     * <li>Returns immediately without any further notice if {@link #missings} is empty.</li>
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
     * <li>Returns immediately without any further notice if {@link #malformeds} is empty.</li>
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
