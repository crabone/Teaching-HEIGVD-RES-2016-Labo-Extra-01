/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author crab_one
 */
public class FileRecorder implements IRecorder {
    
    private String fileName;
    private ISerializer serializer;
    private FileWriter fileWriter;
    
    public FileRecorder(String fileName, ISerializer serializer) {
        this.fileName = fileName;
        this.serializer = serializer;
    }
    
    @Override
    public void init() throws IOException {
        File outputFile = new File(fileName);
        fileWriter = new FileWriter(outputFile);
    }
    
    @Override
    public void record(IData data) throws IOException {
        serializer.serialize(data, fileWriter);
    }
    
    @Override
    public void close() throws IOException {
        fileWriter.close();
    }
}
