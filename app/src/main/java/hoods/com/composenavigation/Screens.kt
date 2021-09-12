package hoods.com.composenavigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ScreenA(onNavigation:() -> Unit) {
    Surface(color = Color.Red, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "This is Screen A")
            Button(
                onClick = { onNavigation()},
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Text(text = "Navigate")
            }
        }
    }
}

@Composable
fun ScreenB(string: String?,onNavigation: () -> Unit) {
    Surface(color = Color.Blue, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "This is Screen C $string")
            Button(
                onClick = { onNavigation() },
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Text(text = "Navigate")
            }
        }
    }
}

@Composable
fun ScreenC(visible:Boolean?,onNavigation: () -> Unit) {
    Surface(color = Color.Green, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            if (visible!!){
                Text(text = "This is Screen C")
            }else{
                Text(text = "Hakuna Matata")
            }
            Button(
                onClick = { onNavigation()},
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Text(text = "Navigate")
            }
        }
    }
}