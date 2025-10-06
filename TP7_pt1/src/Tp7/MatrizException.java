package Tp7;


public class MatrizException extends Exception {
	//me aparecio una advertencia porque esta clase hereda de Exception y seleccione “Add default serial version ID” 
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L; //serialVersionUID es un identificador único de versión
	
	//Estas son las constantes para los codigos de error
    public static final int ERR_COLUMNAS_EXCEDIDAS     = 0;
    public static final int ERR_FILAS_EXCEDIDAS        = 1;
    public static final int ERR_DIMENSIONES_NEGATIVAS  = 2;
    public static final int ERR_FILA_FUERA_DE_RANGO    = 3;
    public static final int ERR_COLUMNA_FUERA_DE_RANGO = 4;

    //Mensajes que describen cada error
    private static final String[] ERRORES = {
        "El número de columnas excede el máximo permitido.",
        "El número de filas excede el máximo permitido.",
        "Las dimensiones de la matriz no pueden ser negativas o cero.",
        "El índice de la fila está fuera de rango.",
        "El índice de la columna está fuera de rango."
    };

    //Constructor que recibe un código de error
    public MatrizException(int codigoError) {
        super(ERRORES[codigoError]);
    }

    //Constructor alternativo para mandar texto personalizado
    public MatrizException(String mensaje) {
        super(mensaje);
    }
}
