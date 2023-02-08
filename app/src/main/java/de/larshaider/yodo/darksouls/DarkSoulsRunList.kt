package de.larshaider.yodo.darksouls

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.larshaider.yodo.darksouls.run.data.DarkSoulsRun

@Composable
fun DarkSoulsRunList(runs: List<DarkSoulsRun>) {

    val context = LocalContext.current

    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = runs,
            itemContent = { run ->
                DarkSoulsRunRow(run = run, onRunClicked = {
                    Toast.makeText(context, "Clicked run", Toast.LENGTH_SHORT).show()
                })
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DarkSoulsRunListPreview() {
    DarkSoulsRunList(listOf())
}