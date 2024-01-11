package com.example.greeting.data

// Location 모델 클래스
data class Location(
    val id: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val timestamp: Long
)

// 제주도 내 실제 관광 명소 위치 데이터를 생성하는 함수
fun createRealJejuLocationData(): List<Location> {
    val jejuLocations = listOf(
        Location(1, "제주국제공항", 33.51135, 126.49277, System.currentTimeMillis()),
        Location(2, "한라산", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(3, "성산일출봉", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(4, "만장굴", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(5, "우도", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(6, "천지연폭포", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(7, "중문관광단지", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(8, "섭지코지", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(9, "한림공원", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(10, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(11, "오설록 티 뮤지엄", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(12, "시려니숲길", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(13, "제주올레길", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(14, "테디베어 뮤지엄", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(15, "카멜리아 릴", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(16, "협재 해수욕장", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(17, "함덕 해수욕장", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(18, "쇼인국 테마파크", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(19, "이효테우해변", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(20, "정빙폭포", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(21, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(22, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(23, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(24, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(25, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(26, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(27, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(28, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(29, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(30, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(31, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(32, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(33, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(34, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(35, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(36, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(37, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(38, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(39, "비자림", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(40, "비자림", 33.36250, 126.53369, System.currentTimeMillis())

    )
    return jejuLocations
}