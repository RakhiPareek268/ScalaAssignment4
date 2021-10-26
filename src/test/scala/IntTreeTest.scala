import org.scalatest.flatspec.AnyFlatSpec
class IntTreeTest extends AnyFlatSpec {
  val obj = IntTreeImpl
  val tree = obj.Node(3, obj.Node(1, obj.Node(8, obj.EmptyTree, obj.EmptyTree),
    obj.EmptyTree), obj.Node(5, obj.EmptyTree, obj.Node(9, obj.EmptyTree, obj.EmptyTree)))

  "check tree" should "contains an element 3" in {
    assert(obj.contains(tree, 3))
  }
  "check tree" should "contains an element 1" in {
    assert(!obj.contains(tree, 2))
  }
  "node" should "insert" in {
    val node = obj.Node(2, IntTreeImpl.Node(10, obj.Node(4, obj.EmptyTree, obj.EmptyTree), obj.EmptyTree), obj.EmptyTree)
    assert(obj.contains(node, 2))
  }
}

