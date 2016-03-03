package ch.heigvd.res.io.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Fabien Franchini
 */
public class MetricsManager {
    
    private List<Metric> metrics;
    
    public MetricsManager(Metric... metrics) {
        this.metrics = Arrays.asList(metrics);
    }
    
    public void exportToCsv(String outputFileName) throws IOException {
        
    }
    
}
