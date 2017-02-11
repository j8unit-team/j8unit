package org.j8unit.internals.runners;

import static java.util.Arrays.asList;
import static org.junit.runner.Description.createSuiteDescription;
import static org.junit.runner.Description.createTestDescription;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/**
 * This runner is somehow a mixture of {@link org.junit.internal.runners.IgnoredClassRunner} and
 * {@link org.junit.internal.runners.ErrorReportingRunner}. Similar to both, this runner breaks a test execution.
 * Whether or not this runner behaves indulgently, this break either fires
 * {@linkplain RunNotifier#fireTestAssumptionFailed(Failure) a failing test assumption} or
 * {@linkplain RunNotifier#fireTestFailure(Failure) a test failure} (and causes the overall test execution to fail).
 */
public class PreconditionFailedRunner
extends Runner {

    private final Class<?> candidate;

    private final String suiteName;

    private final String name;

    private final List<? extends Throwable> causes;

    private final boolean indulgent;

    public PreconditionFailedRunner(final Class<?> candidate, final String name, final Throwable... causes) {
        this(candidate, name, true, causes);
    }

    public PreconditionFailedRunner(final Class<?> candidate, final String name, final List<? extends Throwable> causes) {
        this(candidate, name, true, causes);
    }

    public PreconditionFailedRunner(final Class<?> candidate, final String name, final boolean indulgent, final Throwable... causes) {
        this(candidate, name, indulgent, asList(causes));
    }

    public PreconditionFailedRunner(final Class<?> candidate, final String name, final boolean indulgent, final List<? extends Throwable> causes) {
        this(candidate, null, name, indulgent, causes);
    }

    public PreconditionFailedRunner(final Class<?> candidate, final String suiteName, final String name, final boolean indulgent,
                                    final List<? extends Throwable> causes) {
        this.candidate = candidate;
        this.suiteName = suiteName;
        this.name = name;
        this.causes = causes;
        this.indulgent = indulgent;
    }

    @Override
    public Description getDescription() {
        final Description description = this.getChildDescription();
        if (this.suiteName == null) {
            return description;
        } else {
            final Description suiteDescription = createSuiteDescription(this.suiteName);
            suiteDescription.addChild(description);
            return suiteDescription;
        }
    }

    public Description getChildDescription() {
        return createTestDescription(this.candidate, this.name);
    }

    @Override
    public void run(final RunNotifier notifier) {
        for (final Throwable cause : this.causes) {
            notifier.fireTestStarted(this.getDescription());
            if (this.indulgent) {
                notifier.fireTestAssumptionFailed(new Failure(this.getChildDescription(), cause));
            } else {
                notifier.fireTestFailure(new Failure(this.getChildDescription(), cause));
            }
            notifier.fireTestFinished(this.getChildDescription());
        }
    }

}
