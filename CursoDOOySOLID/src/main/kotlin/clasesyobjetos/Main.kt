package clasesyobjetos

fun main() {
    val firstSong = Song(
        "SOLO",
        "Jennie"
    )
    val secondSong = Song(
        "Whistle",
        "Blackpink"
    )
    val thirdSong = Song(
        "No Roots",
        "Alice Merton"
    )
    secondSong.play()
    secondSong.stop()
    thirdSong.play()
}