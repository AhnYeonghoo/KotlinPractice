// 가장 가까운 사람의 이름을 알려주는 함수
// 거리는 음수 x / 같은 거리 x

fun main() {

    val result1 = solution8("minsu : 3, minji : 4,chan : 1.5, jiu : 2")
    println(result1)
    // 찬혁

    val result2 = solution8("jiyeong : 3.7, minyeong : 1.2, happy : 2.7, funny : 3")
    println(result2)
    //민영

}

fun solution8(str : String) : String {

    val list = str.split(",")

    val nameList = mutableListOf<String>()
    val distanceList = mutableListOf<Double>()

    for (item in list) {
        val name = item.split(" : ")[0]
        val distance = item.split(" : ")[1].toDouble()

        nameList.add(name)
        distanceList.add(distance)
    }


    val minDistance = distanceList.minOrNull()

    val resultIndex = distanceList.indexOf(minDistance)



    return nameList[resultIndex].trim()
}