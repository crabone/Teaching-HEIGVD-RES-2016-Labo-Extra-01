/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

import java.io.IOException;

/**
 *
 * @author crab_one
 */
public interface IRecorder {
    
    public void init() throws IOException;
    public void record(IData data) throws IOException; 
    public void close() throws IOException;
    
}
