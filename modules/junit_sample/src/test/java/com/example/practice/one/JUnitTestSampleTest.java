package com.example.practice.one;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * {@link JUnitTestSample} クラスのテスト
 * @since 2017/10/22
 */
public class JUnitTestSampleTest {

    @Test
    public void plus_引数を2つ与えた場合_加算して返却する() throws Exception {
        JUnitTestSample sut = new JUnitTestSample();

        int ans = sut.plus(1, 3);

        assertThat(ans, is(4));
//        fail this test code !!
//        assertThat(ans, is(2));
    }

    @Test
    public void minus_引数を2つ与えた場合_減算して返却する() throws Exception {
        JUnitTestSample sut = new JUnitTestSample();

        int ans = sut.minus(1, 3);

        assertThat(ans, is(-2));
    }

}