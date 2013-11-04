/*
 * Copyright (c) 2010-2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package at.bestsolution.myfond.cdo.server;

import org.eclipse.net4j.util.om.OMBundle;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.OMLogger;
import org.eclipse.net4j.util.om.trace.OMTracer;

/**
 * The <em>Operations & Maintenance</em> class of this bundle.
 * 
 * @author Eike Stepper
 */
public abstract class OM
{
  public static final String BUNDLE_ID = "at.bestsolution.myfond.cdo.server"; //$NON-NLS-1$

  public static final OMBundle BUNDLE = OMPlatform.INSTANCE.bundle(BUNDLE_ID, OM.class);

  public static final OMTracer DEBUG = BUNDLE.tracer("debug"); //$NON-NLS-1$

  public static final OMLogger LOG = BUNDLE.logger();

//  /**
//   * @author Eike Stepper
//   */
//  public static final class Activator extends OSGiActivator
//  {
//    public Activator()
//    {
//      super(BUNDLE);
//    }
//
//    @Override
//    protected void doStart() throws Exception
//    {
//      DemoServer.INSTANCE.activate();
//    }
//
//    @Override
//    protected void doStop() throws Exception
//    {
//      DemoServer.INSTANCE.deactivate();
//    }
//  }
}