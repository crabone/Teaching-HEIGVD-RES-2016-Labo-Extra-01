/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author crab_one
 */
public class CsvSerializer implements ISerializer {
    
    public void init(IData data, Writer output) throws IOException {
        Collection<String> keys = data.getKeys();
        Iterator i = keys.iterator();
        String line = "";
        
        while (i.hasNext()) {
            line += i.next();
            
            if (i.hasNext()) {
                line += ",";
            }      
        }
        
        output.write(line + "\n");
    }
    
    @Override
    public void serialize(IData data, Writer output) throws IOException {
        Collection<Object> values = data.getValues();
        Iterator i = values.iterator();
        String line = "";
        
        while (i.hasNext()) {
            line += i.next();
            
            if (i.hasNext()) {
                line += ",";
            }      
        }
        
        output.write(line + "\n");
    }
}
