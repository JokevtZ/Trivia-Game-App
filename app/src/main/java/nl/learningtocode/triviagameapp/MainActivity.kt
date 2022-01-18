package nl.learningtocode.triviagameapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import nl.learningtocode.triviagameapp.screen.QuestionsViewModel
import nl.learningtocode.triviagameapp.ui.theme.TriviaGameAppTheme

private val size: String
    get() {
        return ""
    }

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TriviaGameAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    TriviaHome()
                }
            }
        }
    }
}

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()){
    Question(viewModel)
}

@Composable
fun Question(viewModel: QuestionsViewModel){
    val question = viewModel.data.value.data?.toMutableList()

    Log.d("SIZE", "question: ${size}")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TriviaGameAppTheme {

    }
}