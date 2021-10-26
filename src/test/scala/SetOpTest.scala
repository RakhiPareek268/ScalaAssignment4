import org.scalatest.flatspec.AnyFlatSpec
class SetOpTest extends AnyFlatSpec {
  val obj=new SetOperations
  "Union of set1 and set2" should "()"in{
    val set1:Set[Int]=Set()
    val set2:Set[Int]=Set()
    var temp=Set()
    assert(temp==obj.union(set1,set2))
  }
  "Union of set1 and set2" should "(1,2,3)"in{
    val setA:Set[Int]=Set(1,2)
    val setB:Set[Int]=Set(3)
    var temp=obj.union(setA,setB)
    assert(temp==Set(1,2,3))
  }
  "Intersection of set1 and set2" should "()"in{
    val set1:Set[Int]=Set()
    val set2:Set[Int]=Set()
    var temp=Set()
    assert(temp==obj.intersection(set1,set2))
  }
  "Intersection of setA and setB" should "(1,2)"in{
    val setA:Set[Int]=Set(1,2)
    val setB:Set[Int]=Set(3,1,2)
    var temp=obj.intersection(setA,setB)
    assert(temp==Set(1,2))
  }
}
