package Tp7;

import java.util.Vector;
//Esta clase simula una matriz (tabla) donde en cada celda puedes guardar cualquier tipo de objeto.
public class MatrizObjetos {

    static int max_rows = 200;// cantidad maxima de filas 
    static int max_cols = 200;//cantidad máxima de columnas (static=fijo)
    
    private Vector <Object>[] cuerpo; // Vector de objetos (cualquier tipo)

    //Constructor con validaciones (programación defensiva)
    @SuppressWarnings("unchecked")
    public MatrizObjetos(int columnas, int filas) throws MatrizException { //throws MatrizException nos dice que este metodo puede lanzar un error especial 
        if (columnas <= 0 || filas <= 0) {
            throw new MatrizException(MatrizException.ERR_DIMENSIONES_NEGATIVAS);//si la condicion anterior se cumple, manda un error de dimensiones
        }
        if (columnas > max_cols) {//vemos que 'columnas' no sea mayor que el maximo de colunmas que establecimos
            throw new MatrizException(MatrizException.ERR_COLUMNAS_EXCEDIDAS);
        }
        if (filas > max_rows) {//lo mismo aca
            throw new MatrizException(MatrizException.ERR_FILAS_EXCEDIDAS);
        }

        cuerpo = new Vector[filas]; //crea el arreglo 
        for (int i = 0; i < filas; i++) { //recorre cada posición del arreglo
            cuerpo[i] = new Vector<Object>(columnas); //crea un objeto vector
        }
    }

    //Método para insertar un objeto en la matriz
    public void setRowCol(int row, int col, Object obj) throws MatrizException { //row=fila, col=columna
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);//si cumplen estas condiciones muestra un error
        }
        if (col < 0 || col > cuerpo[row].size()) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }

        cuerpo[row].add(col, obj);//guarda el objeto en el vector
    }

    // Método para obtener un objeto de la matriz
    public Object getRowCol(int row, int col) throws MatrizException {
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }
        if (col < 0 || col >= cuerpo[row].size()) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }

        return cuerpo[row].elementAt(col);//devuelve el objeto que se encuentra en el vectorr
    }

    //Representación en texto
    public String toString() {
        String resultado = ""; // Inicializamos la cadena vacía queva a guardar toda la matriz
        
        //Recorrer las filas (i)
        for (int i = 0; i < cuerpo.length; i++) {
            
            //Recorrer las columnas/elementos de la fila actual (j)
            for (int j = 0; j < cuerpo[i].size(); j++) {
                
                //Añadir el elemento actual y un espacio a la cadena
                resultado = resultado + cuerpo[i].elementAt(j) + " ";
            }
        }
        return resultado; // Devolvemos la cadena completa
    }
}


