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

package com.eviware.soapui.support.editor;

import com.eviware.soapui.impl.wsdl.submit.transports.http.DocumentContent;
import com.eviware.soapui.support.PropertyChangeNotifier;

import javax.annotation.Nonnull;

public interface EditorDocument extends PropertyChangeNotifier {
    String DOCUMENT_PROPERTY = EditorDocument.class.getName() + "@content";

    abstract void release();

    @Nonnull
    DocumentContent getDocumentContent(Format format);

    void setDocumentContent(DocumentContent documentContent);

    public static enum Format {
        RAW, XML
    }
}
