package outwatchexperiments

import org.scalatest._
import org.scalajs.dom._
import outwatch.dom._
import outwatch.dom.dsl._
import monix.execution.Scheduler.Implicits.global

class OutwatchexperimentsSpec extends JSDomSpec {

  "You" should "probably add some tests" in {

    val message = "Hello World!"
    OutWatch.renderInto("#app", h1(message)).unsafeRunSync()

    document.body.innerHTML.contains(message) shouldBe true
  }
}
