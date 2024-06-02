package chl.ancud.tutorialscrollablelistpractice.data

import chl.ancud.tutorialscrollablelistpractice.R
import chl.ancud.tutorialscrollablelistpractice.model.Curso

class Datasource {
    object DataSource {
        val topics = listOf(
            Curso(R.string.architecture, 58, R.drawable.architecture, R.string.architecture_descripcion),
            Curso(R.string.crafts, 121, R.drawable.crafts, R.string.crafts_descripcion),
            Curso(R.string.business, 78, R.drawable.business, R.string.business_descripcion),
            Curso(R.string.culinary, 118, R.drawable.culinary, R.string.culinary_descripcion),
            Curso(R.string.design, 423, R.drawable.design, R.string.design_descripcion),
            Curso(R.string.fashion, 92, R.drawable.fashion, R.string.fashion_descripcion),
            Curso(R.string.film, 165, R.drawable.film, R.string.film_descripcion),
            Curso(R.string.gaming, 164, R.drawable.gaming, R.string.gaming_descripcion),
            Curso(R.string.drawing, 326, R.drawable.drawing, R.string.drawing_descripcion),
            Curso(R.string.lifestyle, 305, R.drawable.lifestyle, R.string.lifestyle_descripcion),
            Curso(R.string.music, 212, R.drawable.music, R.string.music_descripcion),
            Curso(R.string.painting, 172, R.drawable.painting, R.string.painting_descripcion),
            Curso(R.string.photography, 321, R.drawable.photography, R.string.photography_descripcion),
            Curso(R.string.tech, 118, R.drawable.tech, R.string.tech_descripcion)
        )
    }
}