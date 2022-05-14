package com.zt1994.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * ReactorTest
 *
 * @author zhongtao
 * @date 2022/5/14 16:57
 */
public class ReactorTest {

    public static void main(String[] args) {
        // just方法直接声明
        Flux.just(1, 2, 3, 4, 5).subscribe(System.out::println);
        Mono.just(1).subscribe(System.out::println);

        // 其它的方法
        Integer[] array = {1, 2, 3, 4};
        Flux.fromArray(array);

        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list);

        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);
    }

}
