fun main() {
    val score = 85  // You can change this value to test different grades

    val grade: String

    if (score >= 90) {
        grade = "A"
    } else if (score >= 80) {
        grade = "B"
    } else if (score >= 70) {
        grade = "C"
    } else if (score >= 60) {
        grade = "D"
    } else {
        grade = "F"
    }

    println("Grade: $grade")
}