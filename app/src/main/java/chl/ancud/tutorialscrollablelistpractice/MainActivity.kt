package chl.ancud.tutorialscrollablelistpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import chl.ancud.tutorialscrollablelistpractice.data.Datasource
import chl.ancud.tutorialscrollablelistpractice.model.Curso
import chl.ancud.tutorialscrollablelistpractice.ui.theme.TutorialScrollableListPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TutorialScrollableListPracticeTheme {
                Scaffold {innerPadding ->
                    Column (
                        modifier = Modifier
                            .padding(innerPadding)
                    ) {
                        CursosApp()
                    }
                }

            }
        }
    }
}

@Composable
fun CursosApp() {
    ListadoCursos(lista = Datasource.DataSource.topics, modifier = Modifier)
}

@Composable
fun TarjetaCurso(
    curso: Curso,
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier
            .height(68.dp)
    ) {
        Row {
            Column (modifier = Modifier) {
                Image(
                    painter = painterResource(id = curso.drawableRes),
                    contentDescription = stringResource(id = curso.stringResDescripcionImagen),
                    Modifier
                        .height(68.dp)
                        .width(68.dp)
                )
            }
            Column {
                Row (
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .wrapContentHeight()
                ) {
                    Text(
                        text = stringResource(id = curso.stringResTipoCurso),
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                            .padding(start = 8.dp ,top = 16.dp)
                    )
                }

                Row (
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .wrapContentHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icono_contador_24),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 8.dp)
                    )
                    Text(
                        text = curso.cuentaCursos.toString(),
                        style = MaterialTheme.typography.labelMedium,
                        modifier = Modifier
                            .padding(start = 8.dp)
                    )
                }
            }
        }
    }

}

@Composable
fun ListadoCursos(
    lista: List<Curso>,
    modifier: Modifier
) {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(lista) {
            TarjetaCurso(
                curso = it,
                modifier = Modifier
                    .padding(start = 8.dp, end = 8.dp, top = 8.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    TutorialScrollableListPracticeTheme {
        CursosApp()
    }
}