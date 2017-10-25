package demo

import org.scalatest.{FlatSpec, Matchers}

class HelloWorldSpec extends FlatSpec with Matchers {

  "hello" should "equals hi" in {
    HelloWorld.hello shouldBe "hi"
  }

}
