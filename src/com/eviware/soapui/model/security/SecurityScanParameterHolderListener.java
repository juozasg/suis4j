/*
 * SoapUI, Copyright (C) 2004-2016 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequen
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the Licence for the specific language governing permissions and limitations
 * under the Licence.
 */

package com.eviware.soapui.model.security;

/**
 * Register when parameter has been added or removed to holder.
 *
 * @author rober
 */
public interface SecurityScanParameterHolderListener {

    /**
     * @param parameter parameter that has been added
     */
    void parameterAdded(SecurityCheckedParameter parameter);

    /**
     * @param parameter parameter that has been removed
     */
    void parameterRemoved(SecurityCheckedParameter parameter);

}
