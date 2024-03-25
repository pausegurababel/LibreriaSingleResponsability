package org.example.repository;

import org.example.models.Enciclopedia;
import org.example.models.GuiaTuristica;
import org.example.models.Libro;

import java.util.Map;
import java.util.HashMap;

public class FakeDB {
    private Map<Integer, Libro> libros;
    private Map<Integer, Enciclopedia> enciclopedias;
    private Map<Integer, GuiaTuristica> guiasTuristicas;

    public FakeDB() {
        this.libros = new HashMap<>();
        this.enciclopedias = new HashMap<>();
        this.guiasTuristicas = new HashMap<>();
    }

    public void guardarLibro(Integer id, Libro libro) {
        libros.put(id, libro);
    }

    public void guardarEnciclopedia(Integer id, Enciclopedia enciclopedia) {
        enciclopedias.put(id, enciclopedia);
    }

    public void guardarGuiaTuristica(Integer id, GuiaTuristica guiaTuristica) {
        guiasTuristicas.put(id, guiaTuristica);
    }
    public Libro recuperarLibro(Integer id) {
        return libros.get(id);
    }

    public Enciclopedia recuperarEnciclopedia(Integer id) {
        return enciclopedias.get(id);
    }

    public GuiaTuristica recuperarGuiaTuristica(Integer id) {
        return guiasTuristicas.get(id);
    }
}
