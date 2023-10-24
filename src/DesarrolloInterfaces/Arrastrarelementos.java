package DesarrolloInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Arrastrarelementos {
    private List<String> elementos;
    private int elementoSeleccionado;

    public Arrastrarelementos() {
        elementos = new ArrayList<>();
        elementoSeleccionado = -1;
    }

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    public void seleccionarElemento(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            elementoSeleccionado = indice;
        } else {
            System.out.println("Error: Índice inválido");
        }
    }

    public void moverElementoDerecha() {
        if (elementoSeleccionado == -1) {
            System.out.println("Error: No hay elemento seleccionado");
        } else if (elementoSeleccionado < elementos.size() - 1) {
            String elemento = elementos.remove(elementoSeleccionado);
            elementos.add(elementoSeleccionado + 1, elemento);
            elementoSeleccionado++;
        }
    }

    public void moverElementoIzquierda() {
        if (elementoSeleccionado == -1) {
            System.out.println("Error: No hay elemento seleccionado");
        } else if (elementoSeleccionado > 0) {
            String elemento = elementos.remove(elementoSeleccionado);
            elementos.add(elementoSeleccionado - 1, elemento);
            elementoSeleccionado--;
        }
    }

    public void mostrarElementos() {
        for (int i = 0; i < elementos.size(); i++) {
            if (i == elementoSeleccionado) {
                System.out.print("[" + elementos.get(i) + "] ");
            } else {
                System.out.print(elementos.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Arrastrarelementos selector = new Arrastrarelementos();

        selector.agregarElemento("Elemento1");
        selector.agregarElemento("Elemento2");
        selector.agregarElemento("Elemento3");

        selector.seleccionarElemento(1);
        selector.mostrarElementos();

        selector.moverElementoDerecha();
        selector.mostrarElementos();

        selector.moverElementoIzquierda();
        selector.mostrarElementos();
    }
}

