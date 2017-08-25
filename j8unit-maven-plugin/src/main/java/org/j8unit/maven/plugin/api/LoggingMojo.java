package org.j8unit.maven.plugin.api;

import static java.lang.String.format;
import org.apache.maven.plugin.Mojo;
import org.apache.maven.plugin.logging.Log;

/**
 * Extension of the {@link Mojo} interface to allow immediate usage of the {@link Log} methods.
 *
 * In addition, each logging level method provides a {@link String#format(String, Object...)} based scenario.
 */
public abstract interface LoggingMojo
extends Mojo, Log {

    @Override
    public default boolean isDebugEnabled() {
        return this.getLog().isDebugEnabled();
    }

    @Override
    public default void debug(final CharSequence content) {
        this.getLog().debug(content);
    }

    public default void debug(final CharSequence format, final Object... args) {
        this.debug(format(format.toString(), args));
    }

    @Override
    public default void debug(final CharSequence content, final Throwable error) {
        this.getLog().debug(content, error);
    }

    @Override
    public default void debug(final Throwable error) {
        this.getLog().debug(error);
    }

    @Override
    public default boolean isInfoEnabled() {
        return this.getLog().isInfoEnabled();
    }

    @Override
    public default void info(final CharSequence content) {
        this.getLog().info(content);
    }

    public default void info(final CharSequence format, final Object... args) {
        this.info(format(format.toString(), args));
    }

    @Override
    public default void info(final CharSequence content, final Throwable error) {
        this.getLog().info(content, error);
    }

    @Override
    public default void info(final Throwable error) {
        this.getLog().info(error);
    }

    @Override
    public default boolean isWarnEnabled() {
        return this.getLog().isWarnEnabled();
    }

    @Override
    public default void warn(final CharSequence content) {
        this.getLog().warn(content);
    }

    public default void warn(final CharSequence format, final Object... args) {
        this.warn(format(format.toString(), args));
    }

    @Override
    public default void warn(final CharSequence content, final Throwable error) {
        this.getLog().warn(content, error);
    }

    @Override
    public default void warn(final Throwable error) {
        this.getLog().warn(error);
    }

    @Override
    public default boolean isErrorEnabled() {
        return this.getLog().isErrorEnabled();
    }

    @Override
    public default void error(final CharSequence content) {
        this.getLog().error(content);
    }

    public default void error(final CharSequence format, final Object... args) {
        this.error(format(format.toString(), args));
    }

    @Override
    public default void error(final CharSequence content, final Throwable error) {
        this.getLog().error(content, error);
    }

    @Override
    public default void error(final Throwable error) {
        this.getLog().error(error);
    }

}
