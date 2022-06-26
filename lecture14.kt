// Elvis operator


fun main() {

    var testStr: String = ""
    println(testStr)

    var testStr2 = null
    println(testStr2)

    var testStr3: String = "abcd"
    println(testStr3)

    var testStr4: String? = null
    println(testStr4)

    println(findStringLength1("absd"))
    println(findStringLength2((null)))
    println(findStringLength3(null))
    println(findStringLength3(("asdsafsaf")))
    println(findStringLength4(("asaf")))
    println(findStringLength4((null)))

}

fun findStringLength1(str : String) : Int {
    return str.length
}

fun findStringLength2(str : String?) : Int? {
    return str?.length
}

fun findStringLength3(str : String?) : Int {
    var resultCount = 0
    if (str != null) {
        resultCount = str.length
    }
    return resultCount
}

fun findStringLength4(str : String?) : Int {
    return str?.length ?: 0
}