package nl.learningtocode.triviagameapp.screen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import nl.learningtocode.triviagameapp.data.DataOrException
import nl.learningtocode.triviagameapp.model.Question
import nl.learningtocode.triviagameapp.repository.QuestionRepository
import javax.inject.Inject


@HiltViewModel
abstract class QuestionsViewModel @Inject constructor(private val repository: QuestionRepository) : ViewModel(){

    val data : MutableState<DataOrException<Question, Boolean, Exception>> = mutableStateOf(
        DataOrException(null, true, Exception(""))
    )

    abstract val ViewModel.viewModelScope : CoroutineScope

    init {
        getAllQuestions()
    }

    private fun getAllQuestions() {
        viewModelScope.launch {
            data.value.loading = true
            data.value = repository.getAllQuestions()

            if (data.value.data.toString().isNotEmpty()) {
                data.value.loading = false
            }
        }
    }
}