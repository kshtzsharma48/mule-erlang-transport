/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.transport.erlang;

import org.mule.tck.FunctionalTestCase;

/**
 * TODO
 */
public class ErlangNamespaceHandlerTestCase extends FunctionalTestCase
{
    protected String getConfigResources()
    {
        //TODO You'll need to edit this file to configure the properties specific to your transport
        return "erlang-namespace-config.xml";
    }

    public void testErlangConfig() throws Exception
    {
        ErlangConnector c = (ErlangConnector) muleContext.getRegistry().lookupConnector("erlangConnector");
        assertNotNull(c);
        assertTrue(c.isConnected());
        assertTrue(c.isStarted());

        //TODO Assert specific properties are configured correctly


    }
}
