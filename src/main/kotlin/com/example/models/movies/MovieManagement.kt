package com.example.models.movies

class MovieManagement {

    private val movies = mutableListOf(
        Movie(
            id = "1",
            title = "La habitación de al lado",
            poster = "https://www.cinesavila.com/sites/default/files/styles/medium/public/web_la_habitacion_de_al_lado.jpg",
            link = "https://www.cinesavila.com/cartelera/la-habitacion-de-al-lado",
            times = listOf("10:00", "12:00", "18:00"),
            calification = "+12",
            director = "Almodovar",
            characters = "Julianne Moore, Tilda Swinton, John Turturro, Alessandro Nivola, Melina Matthews, Vicky Luengo, Juan Diego Botto, Raúl Arévalo",
            duration = "116min",
            linkVideo = "",
            synopsis = "La historia de 'La habitación de al lado' es la de una madre muy imperfecta y una hija rencorosa separadas por un gran malentendido. Entre ambas, otra mujer, Ingrid, amiga de la madre, es depositaria del dolor y la amargura de ambas. Martha, la madre, es reportera de guerra e Ingrid novelista de autoficción. La película habla de la crueldad sin límites de las guerras, de los modos tan distintos en que las dos escritoras se acercan y escriben sobre la realidad, habla de la muerte, de la amistad y del placer sexual como los mejores aliados para luchar contra el horror. Y también habla del dulce despertar con los trinos de los pájaros, en una casa construida en plena reserva natural en New England, donde las dos amigas viven una situación extrema y extrañamente dulce. (ELSÉPTIMOARTE)",
            linkTicket = "https://www.reservaentradas.com/sesiones/avila/cinesbulevar/la-habitacion-de-al-lado-the-room-next-door/487?proximamente=true&"
        )
    )
    fun getAllMovies(): List<Movie> = movies

    fun getMovieById(id: String): Movie? = movies.find { it.id == id }
}