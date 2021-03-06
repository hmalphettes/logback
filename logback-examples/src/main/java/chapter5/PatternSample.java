/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2009, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package chapter5;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;

public class PatternSample {

  static public void main(String[] args) throws Exception {
    Logger rootLogger = (Logger) LoggerFactory.getLogger("root");
    
    PatternLayout layout = new PatternLayout();
    layout.setPattern("%-5level [%thread]: %message%n");
    layout.start();
    
    ConsoleAppender<ILoggingEvent> appender = new ConsoleAppender<ILoggingEvent>();
    appender.setContext(rootLogger.getLoggerContext());
    appender.setLayout(layout);
    appender.start();
    
    rootLogger.addAppender(appender);

    rootLogger.debug("Message 1");
    rootLogger.warn("Message 2");
  }
}