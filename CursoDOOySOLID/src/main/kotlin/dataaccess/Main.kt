package dataaccess

fun main() {
    val firstSong = Song(
        "SOLO",
        "Jennie"
    )

    val secondSong = Song(
        "SOLO",
        "Jennie"
    )

    println("Are Song Objects equals?: ${ firstSong == secondSong }")

    val dataClassSong1 = DataClassSong(
        "SOLO",
        "Jennie"
    )

    val dataClassSong2 = DataClassSong(
        "SOLO",
        "Jennie"
    )

    println("Are Data Song Objects equals?: ${ dataClassSong1 == dataClassSong2 }")
}