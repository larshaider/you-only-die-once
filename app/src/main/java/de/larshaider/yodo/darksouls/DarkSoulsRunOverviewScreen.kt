package de.larshaider.yodo.darksouls

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import de.larshaider.yodo.darksouls.run.data.DarkSoulsRun
import de.larshaider.yodo.darksouls.run.list.DarkSoulsRunListViewModel

@Composable
fun DarkSoulsRunOverviewScreen() {
    val viewModel: DarkSoulsRunListViewModel = hiltViewModel()
    val runs: List<DarkSoulsRun> by viewModel.runs.observeAsState(listOf())
    DarkSoulsRunList(runs)
}

@Preview(showBackground = true)
@Composable
fun DarkSoulsRunOverviewScreenPreview() {
    DarkSoulsRunOverviewScreen()
}