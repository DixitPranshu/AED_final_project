package HospitalManagement.DB4OUtil;

import HospitalManagement.ConfigureASystem;
import HospitalManagement.HospitalManagementEcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

public class HospitalManagementDB4OUtil {

//    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static final String FILENAME = Paths.get("_data.db4o").toAbsolutePath().toString();// path to the data store
    private static HospitalManagementDB4OUtil dB4OUtil;
    
    public synchronized static HospitalManagementDB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new HospitalManagementDB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(HospitalManagementEcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(HospitalManagementEcoSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public HospitalManagementEcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<HospitalManagementEcoSystem> systems = conn.query(HospitalManagementEcoSystem.class); // Change to the object you want to save
        HospitalManagementEcoSystem system;
        if (systems.size() == 0){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
