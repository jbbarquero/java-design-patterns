package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Clase {

    private static final int CHUNK_SIZE = 2;

    public static <T> Stream<List<T>> buffer(final List<T> source, final int length) {
        if (length <= 0)
            throw new IllegalArgumentException("length = " + length);
        int size = source.size();
        if (size <= 0)
            return Stream.empty();
        int fullChunks = (size - 1) / length;
        return IntStream.range(0, fullChunks + 1).mapToObj(n -> source.subList(n * length, n == fullChunks ? size : (n + 1) * length));
    }

    public static void main(String[] args) {
        Stream<List<String>> bufferedCtIds = buffer(getCampaignTrackingIds(), CHUNK_SIZE);
        bufferedCtIds.forEach(ctId -> {
            System.out.println(ctId);
        });
    }

    private static List<String> getCampaignTrackingIds() {
        return Arrays.asList("A", "B", "C");
    }

}
