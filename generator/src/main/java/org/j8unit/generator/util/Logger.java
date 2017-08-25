package org.j8unit.generator.util;

import static java.util.logging.Level.CONFIG;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.FINER;
import static java.util.logging.Level.FINEST;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Level.WARNING;
import java.util.ResourceBundle;
import java.util.function.Supplier;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * Straight-forward proxy {@link java.util.logging.Logger} providing some additional, missing convenient methods:
 *
 * <ul>
 * <li>{@link #log(Level, Supplier, Object...)}</li>
 * <li>{@link #severe(Supplier, Object...)}</li>
 * <li>{@link #warning(Supplier, Object...)}</li>
 * <li>{@link #info(Supplier, Object...)}</li>
 * <li>{@link #config(Supplier, Object...)}</li>
 * <li>{@link #fine(Supplier, Object...)}</li>
 * <li>{@link #finer(Supplier, Object...)}</li>
 * <li>{@link #finest(Supplier, Object...)}</li>
 * <li>{@link #log(Level, CharSequence, Throwable)}</li>
 * <li>{@link #log(Level, Supplier, Throwable)}</li>
 * <li>{@link #logp(Level, String, String, Supplier, Object...)}</li>
 * </ul>
 */
public class Logger
extends java.util.logging.Logger {

    public static Logger getLogger(final String name) {
        final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(name);
        return new Logger(logger);
    }

    public static Logger getLogger(final String name, final String resourceBundleName) {
        final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(name, resourceBundleName);
        return new Logger(logger);
    }

    private final java.util.logging.Logger origin;

    public Logger(final java.util.logging.Logger logger) {
        super(logger.getName(), logger.getResourceBundle().getBaseBundleName());
        this.origin = logger;
    }

    @Override
    public ResourceBundle getResourceBundle() {
        return this.origin.getResourceBundle();
    }

    @Override
    public String getResourceBundleName() {
        return this.origin.getResourceBundleName();
    }

    @Override
    public void setFilter(final Filter newFilter)
    throws SecurityException {
        this.origin.setFilter(newFilter);
    }

    @Override
    public Filter getFilter() {
        return this.origin.getFilter();
    }

    @Override
    public void log(final LogRecord record) {
        this.enrichLogRecord(record);
        this.origin.log(record);
    }

    @Override
    public void log(final Level level, final String msg) {
        this.origin.log(level, msg);
    }

    @Override
    public void log(final Level level, final Supplier<String> msgSupplier) {
        this.origin.log(level, msgSupplier);
    }

    @Override
    public void log(final Level level, final String msg, final Object param1) {
        this.origin.log(level, msg, param1);
    }

    @Override
    public void log(final Level level, final String msg, final Object params[]) {
        this.origin.log(level, msg, params);
    }

    @Override
    public void log(final Level level, final String msg, final Throwable thrown) {
        this.origin.log(level, msg, thrown);
    }

    @Override
    public void log(final Level level, final Throwable thrown, final Supplier<String> msgSupplier) {
        this.origin.log(level, thrown, msgSupplier);
    }

    @Override
    public void logp(final Level level, final String sourceClass, final String sourceMethod, final String msg) {
        this.origin.logp(level, sourceClass, sourceMethod, msg);
    }

    @Override
    public void logp(final Level level, final String sourceClass, final String sourceMethod, final Supplier<String> msgSupplier) {
        this.origin.logp(level, sourceClass, sourceMethod, msgSupplier);
    }

    @Override
    public void logp(final Level level, final String sourceClass, final String sourceMethod, final String msg, final Object param1) {
        this.origin.logp(level, sourceClass, sourceMethod, msg, param1);
    }

    @Override
    public void logp(final Level level, final String sourceClass, final String sourceMethod, final String msg, final Object params[]) {
        this.origin.logp(level, sourceClass, sourceMethod, msg, params);
    }

    @Override
    public void logp(final Level level, final String sourceClass, final String sourceMethod, final String msg, final Throwable thrown) {
        this.origin.logp(level, sourceClass, sourceMethod, msg, thrown);
    }

    @Override
    public void logp(final Level level, final String sourceClass, final String sourceMethod, final Throwable thrown, final Supplier<String> msgSupplier) {
        this.origin.logp(level, sourceClass, sourceMethod, thrown, msgSupplier);
    }

    @Override
    public void logrb(final Level level, final String sourceClass, final String sourceMethod, final ResourceBundle bundle, final String msg,
                      final Object... params) {
        this.origin.logrb(level, sourceClass, sourceMethod, bundle, msg, params);
    }

    @Override
    public void logrb(final Level level, final String sourceClass, final String sourceMethod, final ResourceBundle bundle, final String msg,
                      final Throwable thrown) {
        this.origin.logrb(level, sourceClass, sourceMethod, bundle, msg);
    }

    @Override
    public void entering(final String sourceClass, final String sourceMethod) {
        this.origin.entering(sourceClass, sourceMethod);
    }

    @Override
    public void entering(final String sourceClass, final String sourceMethod, final Object param1) {
        this.origin.entering(sourceClass, sourceMethod, param1);
    }

    @Override
    public void entering(final String sourceClass, final String sourceMethod, final Object params[]) {
        this.origin.entering(sourceClass, sourceMethod, params);
    }

    @Override
    public void exiting(final String sourceClass, final String sourceMethod) {
        this.origin.exiting(sourceClass, sourceMethod);
    }

    @Override
    public void exiting(final String sourceClass, final String sourceMethod, final Object result) {
        this.origin.exiting(sourceClass, sourceMethod);
    }

    @Override
    public void throwing(final String sourceClass, final String sourceMethod, final Throwable thrown) {
        this.origin.throwing(sourceClass, sourceMethod, thrown);
    }

    @Override
    public void severe(final String msg) {
        this.origin.severe(msg);
    }

    @Override
    public void warning(final String msg) {
        this.origin.warning(msg);
    }

    @Override
    public void info(final String msg) {
        this.origin.info(msg);
    }

    @Override
    public void config(final String msg) {
        this.origin.config(msg);
    }

    @Override
    public void fine(final String msg) {
        this.origin.fine(msg);
    }

    @Override
    public void finer(final String msg) {
        this.origin.finer(msg);
    }

    @Override
    public void finest(final String msg) {
        this.origin.finest(msg);
    }

    @Override
    public void severe(final Supplier<String> msgSupplier) {
        this.origin.severe(msgSupplier);
    }

    @Override
    public void warning(final Supplier<String> msgSupplier) {
        this.origin.warning(msgSupplier);
    }

    @Override
    public void info(final Supplier<String> msgSupplier) {
        this.origin.info(msgSupplier);
    }

    @Override
    public void config(final Supplier<String> msgSupplier) {
        this.origin.config(msgSupplier);
    }

    @Override
    public void fine(final Supplier<String> msgSupplier) {
        this.origin.fine(msgSupplier);
    }

    @Override
    public void finer(final Supplier<String> msgSupplier) {
        this.origin.finer(msgSupplier);
    }

    @Override
    public void finest(final Supplier<String> msgSupplier) {
        this.origin.finest(msgSupplier);
    }

    @Override
    public void setLevel(final Level newLevel)
    throws SecurityException {
        this.origin.setLevel(newLevel);
    }

    @Override
    public Level getLevel() {
        return this.origin.getLevel();
    }

    @Override
    public boolean isLoggable(final Level level) {
        return this.origin.isLoggable(level);

    }

    @Override
    public String getName() {
        return this.origin.getName();
    }

    @Override
    public void addHandler(final Handler handler)
    throws SecurityException {
        this.origin.addHandler(handler);
    }

    @Override
    public void removeHandler(final Handler handler)
    throws SecurityException {
        this.origin.removeHandler(handler);
    }

    @Override
    public Handler[] getHandlers() {
        return this.origin.getHandlers();
    }

    @Override
    public void setUseParentHandlers(final boolean useParentHandlers) {
        this.origin.setUseParentHandlers(useParentHandlers);
    }

    @Override
    public boolean getUseParentHandlers() {
        return this.origin.getUseParentHandlers();
    }

    @Override
    public void setResourceBundle(final ResourceBundle bundle) {
        this.origin.setResourceBundle(bundle);
    }

    @Override
    public java.util.logging.Logger getParent() {
        return this.origin.getParent();
    }

    @Override
    public void setParent(final java.util.logging.Logger parent) {
        this.origin.setParent(parent);
    }

    // ADDITIONAL (MISSING) CONVENIENT METHODS

    public void log(final Level level, final Supplier<String> msg, final Object... args) {
        super.log(level, msg.get(), args);
    }

    public void severe(final Supplier<String> msg, final Object... args) {
        this.log(SEVERE, msg, args);
    }

    public void warning(final Supplier<String> msg, final Object... args) {
        this.log(WARNING, msg, args);
    }

    public void info(final Supplier<String> msg, final Object... args) {
        this.log(INFO, msg, args);
    }

    public void config(final Supplier<String> msg, final Object... args) {
        this.log(CONFIG, msg, args);
    }

    public void fine(final Supplier<String> msg, final Object... args) {
        this.log(FINE, msg, args);
    }

    public void finer(final Supplier<String> msg, final Object... args) {
        this.log(FINER, msg, args);
    }

    public void finest(final Supplier<String> msg, final Object... args) {
        this.log(FINEST, msg, args);
    }

    public void log(final Level level, final CharSequence msg, final Throwable t) {
        super.log(level, msg.toString(), t);
    }

    public void log(final Level level, final Supplier<String> msg, final Throwable t) {
        super.log(level, msg.get(), t);
    }

    public void logp(final Level level, final String sourceClass, final String sourceMethod, final Supplier<String> msg, final Object... args) {
        super.logp(level, sourceClass, sourceMethod, msg.get(), args);
    }

    private void enrichLogRecord(final LogRecord record) {
        if (record.getThrown() == null) {
            final Object[] params = record.getParameters();
            if (params.length > 0) {
                final Object last = params[params.length - 1];
                if (last instanceof Throwable) {
                    record.setThrown((Throwable) last);
                }
            }
        }
    }

}
