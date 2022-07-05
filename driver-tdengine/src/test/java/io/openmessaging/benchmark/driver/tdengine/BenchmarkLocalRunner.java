package io.openmessaging.benchmark.driver.tdengine;
import io.openmessaging.benchmark.Benchmark;

public class BenchmarkLocalRunner {
    public static void main(String[] args) throws Exception {
        Benchmark.main(new String[] {"--drivers", "driver-tdengine/tdengine.yaml","workloads/1-topic-16-partitions-1kb.yaml"});
    }
}
