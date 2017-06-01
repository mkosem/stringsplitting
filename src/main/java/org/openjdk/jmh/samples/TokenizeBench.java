package org.openjdk.jmh.samples;

import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 10,batchSize = 200000, time = -1)
@Warmup(iterations = 10,batchSize = 200000, time = -1)
@State(Scope.Benchmark)
public class TokenizeBench{
    @Param(value = {"blarg", "blarg.bloop.blerg.bloooooh.blop.blerrrrrrp", "blarg.bloop.blerg.bloooooh.blop.blerrrrrrp,", "blarg.bloop.blerg.bloooooh.blop.blerrrrrrp.blarg.bloop.blerg.bloooooh.blop.blerrrrrrp"})
    private String STRING;

    @Benchmark
    @Fork(1)
    public void benchmarkStringTokenizer(Blackhole bh) {
        StringTokenizer tokenizer = new StringTokenizer(STRING,".");
        while (tokenizer.hasMoreTokens()) {
            bh.consume(tokenizer.nextToken());
        }
    }
    
    @Benchmark
    @Fork(1)
    public void benchmarkIndexOfTokenize(Blackhole bh) {
        int start = 0;
        int end;
        while ((end = STRING.indexOf('.', start)) != -1) {
            bh.consume(STRING.substring(start, end).length());
            start = end + 1;
        }
        bh.consume(STRING.substring(start));
    }
    
    @Benchmark
    @Fork(1)
    public void benchmarkSplitter(Blackhole bh) {
        Iterable<String> iterable = () -> new SplitIterator(STRING, '.');
        for (String value : iterable) {
            bh.consume(value);
        }
    }
    
    @Benchmark
    @Fork(1)
    public void benchmarkSplitter2(Blackhole bh) {
        Iterable<String> iterable = () -> new SplitIterator2(STRING, '.');
        for (String value : iterable) {
            bh.consume(value);
        }
    }

    @Benchmark
    @Fork(1)
    public void benchmarkSplit(Blackhole bh) {
        for (String entry : STRING.split("\\.")) {
          bh.consume(entry);
        }
    }
    

    public static void main(String[] args) throws RunnerException {   
        Options opt = new OptionsBuilder()
                .include(TokenizeBench.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

}
