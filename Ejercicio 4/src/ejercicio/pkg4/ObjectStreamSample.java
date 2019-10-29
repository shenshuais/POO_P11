package ejercicio.pkg4;

import java.io.*;
import java.util.*;

public class ObjectStreamSample {
    
    public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<Animal>();
        
        //Crea un objeto in que permite leer el Stream qproveniente del archivo        
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
            
            //Intenta (try) leer el Stream que obtiene del archivo y lo guarda en un objerto tipo "Objeto"
            while(true) {
                Object object = in.readObject();
                if(object instanceof Animal)
                    
                    //El objeto se castea a tipo "Animal" y se añade a la lista previamente creada
                    animals.add((Animal)object);
            }
            
            // cuando llegue al final del archivo lanzará la excepcion EOFException ya que no se puede leer el siguiente objeto propio que no hay.
        } catch (EOFException e) {
            // File end reached
        }
        return animals;
    }
    public static void createAnimalsFile(List<Animal> animals, File dataFile)
    throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for(Animal animal: animals)
                out.writeObject(animal);
        }
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Tommy Tiger",5,'T'));
        animals.add(new Animal("Peter Penguin",8,'P'));
        File dataFile = new File("animal.data");
        createAnimalsFile(animals,dataFile);
        System.out.println(getAnimals(dataFile));
    }
}
