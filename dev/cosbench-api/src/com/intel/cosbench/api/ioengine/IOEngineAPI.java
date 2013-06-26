/** 
 
Copyright 2013 Intel Corporation, All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 
*/ 

package com.intel.cosbench.api.ioengine;

import com.intel.cosbench.api.context.*;
import com.intel.cosbench.config.Config;
import com.intel.cosbench.log.Logger;

public interface IOEngineAPI {

    /**
     * Initializes an <code>IOEngine-API</code> with parameters contained in the
     * given <code>config</code>, whose content depends on the specific IOEngine
     * type. Normally, it will also initialize one client for IOEngineentication.
     * 
     * @param config
     *            - one instance from com.intel.cosbench.config.Config, which
     *            includes parameters for IOEngineentication, and it will be passed
     *            from execution engine.
     * @param logger
     *            - one instance from com.intel.cosbench.log.Logger, which
     *            delivers logging capabilities to IOEngine-API, and it will be passed 
     *            from execution engine.
     */
    public boolean init(Config config, Logger logger);

    /**
     * Triggers the back-end IOEngineentication mechanism.
     * 
     * @return IOEngineContext - one com.intel.cosbench.context.IOEngineContext instance which contains all parameters
     *         configured for the IOEngineentication mechanism if IOEngineentication is successful, and otherwise, an 
     *         exception will be raised.
     */
    public IOEngineContext startup() ;
    
    /**
     * Triggers the back-end IOEngineentication mechanism.
     * 
     * @return IOEngineContext - one com.intel.cosbench.context.IOEngineContext instance which contains all parameters
     *         configured for the IOEngineentication mechanism if IOEngineentication is successful, and otherwise, an 
     *         exception will be raised.
     */
    public boolean shutdown();

    /**
     * Retrieves parameters and current settings used by the IOEngine-API.
     * 
     * @return Context - one com.intel.cosbenchc.context.Context instance which contains all parameters
     *         configured for the IOEngineentication mechanism.
     */
    public Context getParms();

    /**
     * Releases the resources held by this IOEngine-API.
     */
    public void dispose();

}
