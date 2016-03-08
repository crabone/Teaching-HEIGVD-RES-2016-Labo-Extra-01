/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

import ch.heigvd.res.io.BufferedIOBenchmark.IOStrategy;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author crab_one
 */
public class BufferedIOBenchmarkData implements IData {
    
    private Map<String, Object> values;

    public BufferedIOBenchmarkData(String operation, IOStrategy strategy, int blockSize, long fileSize, long duration) {
        values.put("operation", operation);
        values.put("strategy", strategy);
        values.put("blockSizeInBytes", blockSize);
        values.put("fileSizeInBytes", fileSize);
        values.put("duration", duration);
    }
    
    @Override
    public Collection<String> getKeys() {
        return values.keySet(); 
    }
    
    @Override
    public Collection<Object> getValues() {
        return values.values();
    }
    
}
