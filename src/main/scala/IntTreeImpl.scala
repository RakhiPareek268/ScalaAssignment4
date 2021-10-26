object IntTreeImpl {
  abstract class IntTree
  case object EmptyTree extends IntTree
  case class Node(element: Int, left: IntTree, right: IntTree) extends IntTree

  def contains(tree: IntTree, v: Int): Boolean = {
    tree match {
      case EmptyTree => false
      case Node(element, left, right) if element< v  => contains(left, v)
      case Node(element, left, right) if element > v => contains(right, v)
      case _ => true
    }
  }

  def insert(t: IntTree, v: Int): IntTree = {
    t match {
      case EmptyTree => Node(v, EmptyTree, EmptyTree)
      case Node(element, left, right) if (element < v) =>
        Node(element, insert(left, v), right)
      case Node(element, left, right) if (element > v) =>
        Node(element, left, insert(right, v))
      case _ => t
    }
  }
}

