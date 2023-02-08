package de.larshaider.yodo.darksouls

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.larshaider.yodo.darksouls.run.data.DarkSoulsRun
import de.larshaider.yodo.darksouls.run.data.DarkSoulsSavedRun

@Composable
fun DarkSoulsRunRow(run: DarkSoulsRun, onRunClicked: (DarkSoulsRun) -> Unit) {
    Card(
        modifier = Modifier.clickable(onClick = { onRunClicked(run) }).fillMaxWidth().padding(8.dp)
    ) {
        Text(text = run.startTime.toString(), style = typography.h6)
    }
}

@Preview(showBackground = true)
@Composable
fun DarkSoulsRunRowPreview() {
    DarkSoulsRunRow(DarkSoulsRun(DarkSoulsSavedRun())) {}
}