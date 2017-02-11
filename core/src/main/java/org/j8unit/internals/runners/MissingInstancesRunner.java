package org.j8unit.internals.runners;

import org.junit.AssumptionViolatedException;

public class MissingInstancesRunner
extends PreconditionFailedRunner {

    public MissingInstancesRunner(final Class<?> candidate, final String name, final String reason) {
        super(candidate, name, new AssumptionViolatedException(reason));
    }

    public MissingInstancesRunner(final Class<?> candidate, final String name, final String reason, final Exception cause) {
        super(candidate, name, new AssumptionViolatedException(reason, cause));
    }

    public MissingInstancesRunner(final Class<?> candidate, final String name, final String reason, final boolean ignore) {
        super(candidate, name, ignore, new AssumptionViolatedException(reason));
    }

    public MissingInstancesRunner(final Class<?> candidate, final String name, final String reason, final boolean ignore, final Exception cause) {
        super(candidate, name, ignore, new AssumptionViolatedException(reason, cause));
    }

}
