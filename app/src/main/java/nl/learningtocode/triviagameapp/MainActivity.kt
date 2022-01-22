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
import nl.learningtocode.triviagameapp.screen.TriviaHome
import nl.learningtocode.triviagameapp.ui.theme.TriviaGameAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TriviaGameAppTheme {
                // A surface container using the 'background' color from the theme
<<<<<<< HEAD
                Surface(color = MaterialTheme.colors.background){

=======
                Surface(color = MaterialTheme.colors.background) {
                    TriviaHome()
>>>>>>> develop
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TriviaGameAppTheme {

    }
}