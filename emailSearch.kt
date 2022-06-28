// 여러 이메일이 담긴 리스트가 있어요!
// 저는 구글로 가입한 사람과 네이버로 가입한 사람의 숫자와
// 그 이외의 이메일로 가입한 사람을 구분하고 싶어요.
// @와 .을 기준으로 어느 사이트에서 들어온 사람들인지 구분을 합니다.
// 함수를 완성하시오.

fun main() {

    val emailList1 = arrayListOf<String>(
            "jay@naver.com",
            "john@naver.com",
            "emily@google.com",
            "ken@google.com",
            "minjun@kakao.com")

    val result1 = solution(emailList1)
    println(result1)

    val emailList2 = arrayListOf<String>(
        "Aiden@naver.com",
        "Andew@naver.com",
        "Adrian@daum.com",
        "Asher@google.com",
        "Austin@kakao.com",
        "Antonio@google.com"
    )
    val result2 = solution(emailList2)
    println(result2)
}

fun solution(emailList : ArrayList<String>) : Map<String, Int> {

    var naverCount = 0
    var googleCount = 0
    var elseCount = 0

    for (email in emailList) {
        val domain = email.split("@")[1].split(".")[0]
        if (domain == "naver") {
            naverCount++
        } else if (domain == "google") {
            googleCount++
        } else {
            elseCount++
        }
    }


    val resultMap = mutableMapOf<String, Int>()
    resultMap["naver"] = naverCount
    resultMap["google"] = googleCount
    resultMap["else"] = elseCount

    return resultMap


}