package io.github.arashiyama11

expect open class Plat() {
  //�v���b�g�t�H�[������Ԃ�
  fun platform():String
}

//���ʂ̊֐�
class Temp: Plat() {
  fun hello()="Hello!"
}