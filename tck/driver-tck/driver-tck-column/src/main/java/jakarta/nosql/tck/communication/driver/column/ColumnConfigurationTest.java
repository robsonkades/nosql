/*
 *  Copyright (c) 2020 Otavio Santana and others
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License v. 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0.
 *
 *  This Source Code may also be made available under the following Secondary
 *  Licenses when the conditions for such availability set forth in the Eclipse
 *  Public License v. 2.0 are satisfied: GNU General Public License v2.0
 *  w/Classpath exception which is available at
 *  https://www.gnu.org/software/classpath/license.html.
 *
 *  SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package jakarta.nosql.tck.communication.driver.column;


import jakarta.nosql.column.ColumnConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColumnConfigurationTest {

    @Test
    public void shouldCreateInstance() {
        final ColumnConfiguration configuration = ColumnConfiguration.getConfiguration();
        Assertions.assertNotNull(configuration);
    }

    @Test
    public void shouldReturnErrorWhenTheParameterIsNull() {
        final ColumnConfiguration configuration = ColumnConfiguration.getConfiguration();
        Assertions.assertThrows(NullPointerException.class, () -> configuration.get(null));
    }


}
