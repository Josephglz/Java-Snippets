import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Files_TXT 
{
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
