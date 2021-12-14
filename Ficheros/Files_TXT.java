import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Files_TXT 
{
    /*
        ESTE MÉTODO TE PERMITE CREAR UN ARCHIVO DE TEXTO CON UN NOMBRE ESPECÍFICO.
        EJEMPLO: createNewFile("nombres.txt");
    */
    public void createNewFile(String nombreArchivo)
    {
        try
        {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists())
            {
                archivo.createNewFile();
            }
        }
        catch (Exception e)
        {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    /*
        ESTE MÉTODO TE PERMITE ELIMINAR UN ARCHIVO DE TEXTO CON UN NOMBRE ESPECÍFICO.
        EJEMPLO: deleteFile("nombres.txt");
    */
    public void deleteFile(String nombreArchivo)
    {
        try
        {
            File archivo = new File(nombreArchivo);
            if (archivo.exists())
            {
                archivo.delete();
            }
        }
        catch (Exception e)
        {
            System.out.println("Error al eliminar archivo: " + e.getMessage());
        }
    }

    /*
        ESTE MÉTODO TE PERMITE IMPRIMIR EN CONSOLA UN ARCHIVO DE TEXTO CON UN NOMBRE ESPECÍFICO.
        EJEMPLO: readFile("nombres.txt");
    */

    public void readFile(String nombreArchivo)
    {
        try
        {
            File archivo = new File(nombreArchivo);
            if (archivo.exists())
            {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null)
                {
                    System.out.println(linea);
                }
                br.close();
            }
        }
        catch (Exception e)
        {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }

    /*
        ESTE MÉTODO TE PERMITE SOBREESCRIBIR UN ARCHIVO DE TEXTO CON UN CONTENIDO ESPECÍFICO.
        EJEMPLO 1: rewriteFile("nombres.txt", "Juan\nPedro\nJavier\n");
        EJEMPLO 2: String nombres = "Juan\nPedro\nJavier\n";
                    rewriteFile("nombres.txt", nombres);
    */

    public void rewriteFile(String nombreArchivo, String contenido)
    {
        try
        {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists())
            {
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        }
        catch (Exception e)
        {
            System.out.println("Error al sobreescribir archivo: " + e.getMessage());
        }
    }

    /*
        ESTE MÉTODO TE PERMITE EDITAR UN ARCHIVO DE TEXTO CON UN NOMBRE ESPECÍFICO AÑADIENDO EL CONTENIDO AL FINAL.
        EJEMPLO 1: editFile("nombres.txt", "Pablo\nRodrigo\nLuis\n");
        EJEMPLO 2: String nombres = "Pablo\nRodrigo\nLuis\n";
                    editFile("nombres.txt", nombres);
    */

    public void editFile(String nombreArchivo, String contenido)
    {
        try
        {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists())
            {
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        }
        catch (Exception e)
        {
            System.out.println("Error al editar archivo: " + e.getMessage());
        }
    }    
}
