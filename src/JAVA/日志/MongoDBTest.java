package JAVA.日志;
/*
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
*/
public class MongoDBTest {/*
	public static Logger logger = Logger.getLogger(MongoDBTest.class.getName());

	public static void main(String[] args) {
		MongoClient mongoClient = null;
		try {  
			
            ServerAddress serverAddress = new ServerAddress("192.168.0.147",27017);  
            List<ServerAddress> addrs = new ArrayList<ServerAddress>();  
            addrs.add(serverAddress);  
              
            MongoCredential credential = MongoCredential.createScramSha1Credential("userName", "N_A20170326", "password".toCharArray());  
            List<MongoCredential> credentials = new ArrayList<MongoCredential>();  
            credentials.add(credential);  
              
            //通过连接认证获取MongoDB连接   
            mongoClient = new MongoClient(addrs,credentials);  
              
            //连接数据库  
            MongoDatabase db = mongoClient.getDatabase("db_test");  
            
            //创建集合
            createCollection(db,"coll_create");
              
            //获取集合
            MongoCollection<Document> coll = selectCollection(db,"coll_get");
            
            //删除集合
//            deleteDocument(db,coll,val,"one");  //one all
           
              
            //删除第一个文档  
            
            
            //检索查看结果  
            FindIterable<Document> iter = coll.find();  
            MongoCursor<Document> mongoCursor = iter.iterator();  
            while(mongoCursor.hasNext()){  
                System.out.println(mongoCursor.next());  
            }  
              
        } catch (Exception e) {  
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );  
        } finally{
        	mongoClient.close();
        }
	}

	private static void deleteDocument(MongoDatabase db,MongoCollection<Document> coll, String string) {
		
		
//		coll = db.getCollection(collName);
		
	}

	private static MongoCollection<Document> selectCollection(MongoDatabase db, String collName) {
		 MongoCollection<Document> coll = db.getCollection(collName);  
         System.out.println("Collection "+collName+" selected successfully");  
         return coll;
	}

	private static void createCollection(MongoDatabase db, String collName) {
		db.createCollection(collName);  
        System.out.println(collName+" created successfully");  
	}
	
*/}
