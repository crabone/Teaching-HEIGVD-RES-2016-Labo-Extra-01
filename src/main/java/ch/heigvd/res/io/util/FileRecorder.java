/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

import java.io.FileWriter;

/**
 *
 * @author crab_one
 */
public class FileRecorder implements IRecorder {
    
    private String fileName;
    private ISerializer serializer;
    private FileWriter outputFile;
    
    public FileRecorder(String fileName, ISerializer serializer) {
        this.fileName = fileName;
        this.serializer = serializer;        
    }
    
    public void init() {
        // TODO...
    }
    
    public void record(IData data) {
        serializer.serialize(data, outputFile);
    }
    
    public void close() {
        // TODO...
    }
}
