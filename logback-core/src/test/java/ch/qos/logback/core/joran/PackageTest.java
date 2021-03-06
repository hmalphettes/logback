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
package ch.qos.logback.core.joran;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SkippingInInterpreterTest.class, TrivialConfiguratorTest.class, ch.qos.logback.core.joran.action.PackageTest.class,
  ch.qos.logback.core.joran.event.PackageTest.class,
  ch.qos.logback.core.joran.spi.PackageTest.class,
  ch.qos.logback.core.joran.replay.PackageTest.class,
  ch.qos.logback.core.joran.implicitAction.PackageTest.class
 })
public class PackageTest {

}
