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

package com.eviware.soapui.support;

import com.eviware.soapui.model.ModelItem;

import javax.annotation.Nonnull;

/**
 * Utility class to create unique names for model items
 * <p/>
 * Creates a new name from the baseName and the next available number.
 * <p/>
 * Example:
 * Given
 * baseName: "Project"
 * items: "Project 1", "Project 2", "Project 3", "Project 5"
 * Then
 * Returns the name "Project 6"
 *
 * @author Anders Jaensson
 * @author Prakash Ja
 */
public class ModelItemNamer {
    private ModelItemNamer() {
    }

    public static String createName(String baseName, Iterable nameHolders) {
        int maxExistingIndex = 0;
        for (Object nameHolder : nameHolders) {
            if (nameHolder == null) {
                continue;
            }
            String name = getName(nameHolder);
            if (name.contains(baseName)) {
                try {
                    int beginIndex = name.indexOf(baseName) + baseName.length();
                    int indexInProjectName = Integer.parseInt(name.substring(beginIndex).trim());
                    if (indexInProjectName > maxExistingIndex) {
                        maxExistingIndex = indexInProjectName;
                    }
                } catch (Exception e) {
                    //Do nothing, at worst it will create the modelItem with same name
                }
            }
        }

        return baseName + " " + (++maxExistingIndex);
    }

    private static String getName(@Nonnull Object nameHolder) {
        return nameHolder instanceof ModelItem ? ((ModelItem) nameHolder).getName() : nameHolder.toString();
    }
}
