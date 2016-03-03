package ch.heigvd.res.io.util;

import ch.heigvd.res.io.BufferedIOBenchmark.IOStrategy;

/**
 * 
 * @author Fabien Franchini
 */
public class Metric { 
    
    private String operation;
    private IOStrategy strategy;
    private int blockSize;
    private int fileSize;
    private int duration;
    
    public Metric(String operation, IOStrategy strategy, int blockSize, int fileSize, int duration) {
        this.operation = operation;
        this.strategy = strategy;
        this.blockSize = blockSize;
        this.fileSize = fileSize;
        this.duration = duration;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public IOStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IOStrategy strategy) {
        this.strategy = strategy;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
    
