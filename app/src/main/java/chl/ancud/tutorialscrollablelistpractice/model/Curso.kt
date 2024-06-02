package chl.ancud.tutorialscrollablelistpractice.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Curso (
    @StringRes val stringResTipoCurso: Int,
    val cuentaCursos: Int,
    @DrawableRes val drawableRes: Int,
    @StringRes val stringResDescripcionImagen: Int

)