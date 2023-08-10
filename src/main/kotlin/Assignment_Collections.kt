
//1. create a list of 10 integers; 89,45,23,5,67,12,55,89,54,55
//  and print them out in ascending order.
//var GroupB:
//var GroupA:

fun main() {
    val nambaz = listOf(89, 45, 23, 5, 67, 12, 55, 89, 54, 55)

    val sNambaz = nambaz.sorted()

    println("Numbers in ascending order:")
    for (nambaz in sNambaz) {
        println(nambaz)
    }
    question2()

}

//2. Assuming a group A contains elements {a,b,c,d,e,a,g,r,f}
// group B contains {ant,bee, elephant,dog, cat}. create a map that links the two
//groups Using their first characters.

fun question2 () {
    val GroupA = listOf('a', 'b', 'c', 'd', 'e', 'a', 'g', 'r', 'f')
    val GroupB = listOf("ant", "bee", "elephant", "dog", "cat")
    val map = mutableMapOf<Char, String>()

    for ((index, char) in GroupA.withIndex()) {
        if (index < GroupB.size) {
            map[char] = GroupB[index]
        } else {
            map[char] = "-"
        }
    }

    println(map)
    addEntry()
}

// After implementing 2 above, add five entries that map five unique characters to
// the respective animal name.
fun addEntry (){
    val updatedGroupA = listOf('_')
    val updatedGroupB = listOf('_')
    updatedGroupA.add('g','h', 'i', 'j', 'k')
    updatedGroupB.add("Cow", "goat", "sheep", "lion", "giraffe")

}