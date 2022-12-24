package io.github.arashiyama11

expect open class Plat() {
  //プラットフォーム名を返す
  fun platform():String
}

//共通の関数
class Temp: Plat() {
  fun hello()="Hello!"
}