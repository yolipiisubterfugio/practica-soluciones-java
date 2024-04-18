-- Creación de la tabla de géneros
CREATE TABLE generos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL UNIQUE
);

-- Creación de la tabla de directores
CREATE TABLE directores (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL UNIQUE,
    url_imagen TEXT,
    url_web TEXT
);

-- Creación de la tabla de películas
CREATE TABLE peliculas (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    titulo TEXT NOT NULL,
    anno_estreno INTEGER NOT NULL,
    genero_id INTEGER NOT NULL,
    director_id INTEGER NOT NULL,
    animacion TEXT NOT NULL CHECK (animacion IN ('S', 'N')),
    FOREIGN KEY (genero_id) REFERENCES generos(id),
    FOREIGN KEY (director_id) REFERENCES directores(id)
);

-- Inserción de los géneros
INSERT INTO generos (nombre) VALUES
('Acción'),
('Aventura'),
('Comedia'),
('Drama'),
('Fantasía'),
('Terror'),
('Ciencia ficción (Sci-Fi)'),
('Musical/Danza'),
('Suspense'),
('Western'),
('Documental'),
('Biográfico (Biopic)'),
('Romance');

COMMIT;
