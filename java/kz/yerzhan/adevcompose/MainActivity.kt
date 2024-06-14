package kz.yerzhan.adevcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAnim()
        }
    }
}

@Composable
fun ComposeAnim(){
    Card {
        var expanded by remember {
            mutableStateOf(false)
        }
        Column(modifier = Modifier
            .size(width = 200.dp, height = 200.dp)
            .clickable { expanded = !expanded },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(R.drawable.jetpack_compose_icon), contentDescription = "")
            AnimatedVisibility(visible = expanded) {
                Text(text = "Jetpack Compose",
                    style = MaterialTheme.typography.bodyLarge)

            }
        }
    }
}

