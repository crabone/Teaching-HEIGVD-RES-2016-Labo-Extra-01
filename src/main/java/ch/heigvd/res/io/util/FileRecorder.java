/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

/**
 *
 * @author crab_one
 */
public class FileRecorder implements IRecorder {
    
    private String fileName;
    private ISerializer serializer;
    
    public FileRecorder(String fileName, ISerializer serializer) {
        this.fileName = fileName;
        this.serializer = serializer;        
    }
    
    public void init() {
        // TODO...
    }
    
    public void record(IData data) {
        // TODO...
    }
    
    public void close() {
        // TODO...
    }
}
