package com.example.practice.one;

/**
 * JUnitを使ったテストのためのサンプルクラス
 * @since 2017/10/22
 */
public class JUnitTestSample {

    /**
     * 与えられた引数の値を加算して返却します
     * @param i 任意の整数
     * @param j 変数の整数
     * @return 加算結果
     */
    public int plus(final int i, final int j) {
        return i + j;
    }

    /**
     * 与えられた引数の値を減算して返却します
     * @param i 減算される整数
     * @param j 減算する整数
     * @return 減算結果
     */
    public int minus(final int i, final int j) {
        return i - j;
    }

}