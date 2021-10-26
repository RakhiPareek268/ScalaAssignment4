class SetOperations {
  def union(setA: Set[Int], setB: Set[Int]):Set[Int] = {
    var newset: Set[Int] = Set()
    if (setA.isEmpty && setB.isEmpty) {
      newset
    }
    else {
      newset = setA ++ setB
      newset
    }
  }

  def intersection(setA: Set[Int], setB: Set[Int]): Set[Int] = {
    var newset: Set[Int] = Set()
    if (setA.isEmpty && setB.isEmpty) {
      newset
    }
    else {
      var diff = setA.diff(setB)
      var diff2 =setB.diff(setA)
      newset=setB.diff(diff2)
      newset
    }
  }
}















