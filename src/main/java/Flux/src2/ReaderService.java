package Flux.src2;

import reactor.core.publisher.SynchronousSink;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.util.concurrent.SynchronousQueue;
import java.util.function.BiFunction;

public class ReaderService {
    private Callable<BufferedReader> openReader(Path path){
        return ()-> Files.newBufferedReader(path);
    }

    private BiFunction<BufferedReader, SynchronousSink<String>,BufferedReader> read()
    {
        return (br, sink) -> {
            try {
                String line = br.readLine();
            } catch (IOException e)
            {
                sink.error(e);
            }
            return br;
        };
    }


}
