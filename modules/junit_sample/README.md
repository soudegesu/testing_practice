# junit_sample

junitを使ったテストコード実装の学習をしましょう

## junitのコードを動かしてみよう

まず最初にjunitを使用したテストコードの実行を学びます

`com.example.practice.one.JUnitTestSample` クラスと、それと対になるテストクラス 
`com.example.practice.one.JUnitTestSampleTest`

* やってみよう
  * `JUnitTestSampleTest` を実行して、テストが全て `Green` になることを確認しよう
  * `JUnitTestSampleTest` の22行目のコメントアウトを解除して、テストが `Red` になることを確認しよう

* ここで学ぶこと
  * テストの実行方法
  * テストの成功(Green)と失敗(Red)
  * テストの期待値定義と評価

## 問題1

`com.example.practice.two` パッケージの `AnimalVoice` クラスを実装しよう

`AnimalVoice` クラスの `voice` メソッドには以下のような振る舞いが備わっている。

* `voice` メソッドには渡された引数に応じて動物の鳴き声を文字列として返却する
  * `DOG` の場合には `ワンワン!!`
  * `CAT` の場合には `にゃー!!`
  * `BIRD` の場合には `ぴよ`
  * `HUMAN` の場合には `オス!おら悟空!!`
* それ以外の動物の場合には `UMAException` が上位に `throw` される

* ここで学ぶこと
  * 正常系 / 異常系のテスト
  * fail first によるテスト
  * テストカバレッジ
 