package hackerrank.interview.arrays.left_rotation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> result = new ArrayList<>();
        int resetIndex = 0;
        int startIndex = d;
        
        int count = a.size();
        for (int i = 0; i < count; i++) {
            if (startIndex == count) {
                result.add(a.get(resetIndex));
                resetIndex++;
            } else {
                result.add(a.get(startIndex));
                startIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Result result = new Result();

        List<Integer> sampleList = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            sampleList.add(i);
        }
        int sampleIndex = 4;
        List<Integer> resultList = result.rotLeft(sampleList, sampleIndex);
        System.out.println("before: " + sampleList.toString());
        System.out.println("result: " + resultList.toString());
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotLeft(a, d);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

     
}