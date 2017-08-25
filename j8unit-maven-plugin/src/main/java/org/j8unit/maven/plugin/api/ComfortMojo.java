package org.j8unit.maven.plugin.api;

import static org.apache.maven.plugin.MojoExecution.Source.CLI;
import static org.j8unit.maven.plugin.Messages.Keys.AVOIDABLE_EXCEPTION;
import static org.j8unit.maven.plugin.Messages.Keys.SKIP_MOJO_CLI;
import static org.j8unit.maven.plugin.Messages.Keys.SKIP_MOJO_LIFECYCLE;
import org.apache.maven.model.Plugin;
import org.apache.maven.plugin.Mojo;
import org.apache.maven.plugin.MojoExecution;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Comfort extension of the {@link Mojo} API (see {@link #execute()}.
 */
public abstract interface ComfortMojo
extends Mojo, LoggingMojo {

    /**
     * Returns a message (pattern) for the given message key.
     *
     * @param key
     *            the message's identifier
     * @return the according message (pattern)
     */
    public abstract String message(final CharSequence key);

    /**
     * Returns the actual Mojo execution.
     *
     * @return the actual Mojo execution
     */
    public abstract MojoExecution getMojoExecution();

    /**
     * Returns {@code true} if the Mojo execution shall be skipped; {@code false} otherwise.
     *
     * @return {@code true} iff the Mojo execution shall be skipped
     */
    public abstract boolean skip();

    /**
     * Default implementation of the {@link Mojo#execute() Mojo's execute API}. It supports MOJO skipping (see
     * {@link #skip()}) and (via calling {@link #executeMojo()}) handles all checked exceptions beyond
     * {@link MojoExecutionException} and {@link MojoFailureException}.
     *
     * @throws RuntimeException
     *             rethrown if thrown by {@link #executeMojo()}
     * @throws MojoFailureException
     *             rethrown if thrown by {@link #executeMojo()}
     * @throws MojoExecutionException
     *             rethrown if thrown by {@link #executeMojo()} or wrapping any checked exception thrown by
     *             {@link #getMojoExecution()}
     */
    @Override
    default void execute()
    throws MojoExecutionException, MojoFailureException {
        if (skip()) {
            final MojoExecution execution = this.getMojoExecution();
            final CharSequence key = CLI.equals(execution.getSource()) ? SKIP_MOJO_CLI : SKIP_MOJO_LIFECYCLE;
            final Plugin plugin = execution.getPlugin();
            final String id = execution.getExecutionId();
            final String goal = execution.getGoal();
            final String phase = execution.getLifecyclePhase();
            this.info(this.message(key), plugin.getKey(), id, goal, phase);
            return;
        } else {
            try {
                executeMojo();
            } catch (final RuntimeException | MojoExecutionException | MojoFailureException rethrow) {
                this.error(rethrow.getMessage(), rethrow);
                throw rethrow;
            } catch (final Exception any) {
                final MojoExecutionException wrapper = new J8UnitMojoExecutionException(any, this.message(AVOIDABLE_EXCEPTION), any.getMessage());
                this.error(wrapper.getMessage(), wrapper);
                throw wrapper;
            }
        }
    }

    /**
     * Similar to {@link Mojo#execute() good ol' Mojo's execute}: Perform whatever build-process behavior this
     * {@link Mojo} implements.
     *
     * @throws RuntimeException
     *             if an unexpected problem (runtime exception) occurs
     * @throws Exception
     *             if an unexpected problem (checked exception) occurs
     * @throws MojoExecutionException
     *             if an unexpected problem occurs (causing Maven to display a "BUILD ERROR" message)
     * @throws MojoFailureException
     *             if an expected problem &ndash;&nbsp;such as a compilation failure&nbsp;&ndash; occurs (causing Maven
     *             to display a "BUILD FAILURE" message)
     */
    public abstract void executeMojo()
    throws RuntimeException, Exception, MojoExecutionException, MojoFailureException;

}
