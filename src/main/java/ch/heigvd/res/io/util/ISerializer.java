/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author crab_one
 */
public interface ISerializer {
    
    public void serialize(IData data, Writer output) throws IOException;
    
}
