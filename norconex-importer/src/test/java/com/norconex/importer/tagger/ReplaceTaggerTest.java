/* Copyright 2010-2013 Norconex Inc.
 * 
 * This file is part of Norconex Importer.
 * 
 * Norconex Importer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Norconex Importer is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Norconex Importer. If not, see <http://www.gnu.org/licenses/>.
 */
package com.norconex.importer.tagger;

import java.io.IOException;

import org.junit.Test;

import com.norconex.commons.lang.config.ConfigurationUtil;
import com.norconex.importer.tagger.impl.ReplaceTagger;

public class ReplaceTaggerTest {

    @Test
    public void testWriteRead() throws IOException {
        ReplaceTagger tagger = new ReplaceTagger();
        tagger.addReplacement("fromValue1", "toValue1", "fromName1");
        tagger.addReplacement("fromValue2", "toValue2", "fromName1");
        tagger.addReplacement("fromValue1", "toValue1", "fromName2", "toName2");
        tagger.addReplacement("fromValue3", "toValue3", "fromName3", "toName3");
        System.out.println("Writing/Reading this: " + tagger);
        ConfigurationUtil.assertWriteRead(tagger);
    }

}
