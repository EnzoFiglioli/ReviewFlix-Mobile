package com.example.reviewflix.repositories

import com.example.reviewflix.model.Movie

class MovieRepository {
    public val movies = listOf(
        Movie("Memento", 2000, "Sci-fi", "Christopher Nolan",
            "Un hombre con amnesia reciente intenta encontrar al asesino de su esposa usando notas y tatuajes."),
        Movie("Star Wars IV: A New Hope", 1977, "Sci-fi", "George Lucas",
            "Luke Skywalker se une a la Rebelión para enfrentar al Imperio Galáctico."),
        Movie("Vertigo", 1958, "Thriller", "Alfred Hitchcock",
            "Un detective desarrolla una peligrosa obsesión por una mujer misteriosa."),
        Movie("Annie Hall", 1977, "Comedy", "Woody Allen",
            "Un comediante reflexiona sobre su relación fallida con Annie Hall."),
        Movie(
            "The Matrix",
            1999,
            "Sci-fi",
            "Lana & Lilly Wachowski",
            "Un hacker descubre que la realidad es una simulación creada por máquinas y se une a un grupo de rebeldes para liberar a la humanidad."
        ),

        Movie(
            "Pulp Fiction",
            1994,
            "Crime",
            "Quentin Tarantino",
            "Historias de criminales, boxeadores y mafiosos se entrelazan en un relato no lineal lleno de humor negro y violencia estilizada."
        ),

        Movie(
            "The Godfather",
            1972,
            "Crime",
            "Francis Ford Coppola",
            "La historia de la familia Corleone, donde el joven Michael se ve obligado a involucrarse en el mundo del crimen organizado."
        ),

        Movie(
            "Blade Runner",
            1982,
            "Sci-fi",
            "Ridley Scott",
            "Un detective debe retirar replicantes rebeldes mientras cuestiona qué significa ser humano en un mundo futurista decadente."
        ),

        Movie(
            "Fight Club",
            1999,
            "Drama",
            "David Fincher",
            "Un oficinista insomne encuentra un escape en un club clandestino de peleas, desencadenando una rebelión contra la sociedad moderna."
        ),

        Movie(
            "The Shawshank Redemption",
            1994,
            "Drama",
            "Frank Darabont",
            "Un banquero acusado injustamente de asesinato forma una amistad profunda en prisión mientras busca recuperar su libertad."
        ),

        Movie(
            "The Social Network",
            2010,
            "Drama",
            "David Fincher",
            "La creación de Facebook provoca conflictos legales y traiciones entre jóvenes emprendedores en Harvard."
        ),

        Movie(
            "Inception",
            2010,
            "Sci-fi",
            "Christopher Nolan",
            "Un ladrón especializado en entrar en los sueños recibe la misión de implantar una idea en la mente de un heredero corporativo."
        ),

        Movie(
            "La La Land",
            2016,
            "Musical",
            "Damien Chazelle",
            "Un pianista de jazz y una actriz en ascenso luchan entre el amor y sus sueños en Los Ángeles."
        ),

        Movie(
            "The Grand Budapest Hotel",
            2014,
            "Comedy",
            "Wes Anderson",
            "Un conserje excéntrico y su joven lobby boy viven aventuras absurdas en un hotel europeo durante tiempos turbulentos."
        )
    )
}