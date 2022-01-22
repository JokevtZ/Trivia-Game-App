package nl.learningtocode.triviagameapp.model

data class QuestionItem(
    val answers: List<String>,
    val category: String,
    val correct_answer: String,
    val question: String
)