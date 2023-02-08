package de.larshaider.yodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.larshaider.yodo.navigation.Navigation
import de.larshaider.yodo.ui.theme.ApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ApplicationTheme {
                Navigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ApplicationTheme {
        Navigation()
    }
}