package JAVA.数据库.mongodb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
/**
 * MongoDB工具类
 * @author      韩水球
 * @createDate  2017年6月22日 下午6:15:02 
 * @version     v1.0
 */
public class MongoUtils {
	private static MongoClient client;

	public static void main(String[] args) {
		
		MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase db = client.getDatabase("Test2");
		db.createCollection("test2");
//		MongoCollection<Document> coll = db.getCollection("Test");
//		FindIterable<Document> findIter = coll.find(/*Filters.regex(fieldName, pattern)*/).noCursorTimeout(true);
//		
//		MongoClient _client = MongoUtils.getClient("localhost", 27017);
//		MongoUtils.init(_client);
//		Document doc = MongoUtils.findFirst("", "");
		
		client.close();
	}
	
	public static Bson appendQuery(Document d, String[] keys) {
		BasicDBObject query = new BasicDBObject();
		for(String k : keys){
			query.append(k, d.get(k));
		}
		return query;
	}
	
	/**
	 * 
	 * @param d       
	 * @param sorts  
	 * @return
	 */
	public static Bson appendSort(Document d, Map<String, Integer> sorts) {
		BasicDBObject bson = new BasicDBObject();
		Iterator<Entry<String, Integer>> iter = sorts.entrySet().iterator();
		Entry<String, Integer> e = null;
		while(iter.hasNext()){
			e = iter.next();
			bson.append(e.getKey().trim() , e.getValue());
		}
		return bson;
	}
	
	/**
	 * 创建集合
	 * @param dbName    库名
	 * @param collName  集合名
	 */
	public static void createColl(String dbName, String collName){
		client.getDatabase(dbName).createCollection(collName);
	}
	
	/**
	 * 删除数据库
	 * @param dbName    库名
	 */
	public static void dropDB(String dbName){
		client.dropDatabase(dbName);
	}
	
	/**
	 * 删除集合
	 * @param dbName    库名
	 * @param collName  集合名
	 */
	public static void dropColl(String dbName, String collName){
		client.getDatabase(dbName).getCollection(collName).drop();
	}
	
	/**
	 * 查询全部符合条件的文档
	 * @param coll 集合
	 * @param d    文档
	 * @param keys 查询条件的key
	 * @return
	 */
	public static FindIterable<Document> find(MongoCollection<Document> coll, Document d, String[] keys){
		BasicDBObject condition = new BasicDBObject();
		for (String key : keys) {
			condition.append(key, d.get(key));
		}
		FindIterable<Document> findIter = coll.find(condition).noCursorTimeout(true);
		return findIter;
	}
	
	/**
	 * 查询全部符合条件的文档并返回集合
	 * @param coll  集合
	 * @param key   筛选字段
	 * @param query 筛选条件
	 * @param specificVal 筛选值
	 * @return
	 */
	public static List<Document> find(MongoCollection<Document> coll, String key, String query, String specificVal){
		ArrayList<Document> findList = new ArrayList<Document>();
		Map<String, BasicDBObject> map = new HashMap<String,BasicDBObject>();
		map.put(key, new BasicDBObject(query, specificVal));  //query如$gte
		BasicDBObject bson = new BasicDBObject(map);
		List<Document> docList = coll.find(bson).noCursorTimeout(true).into( findList);
		return docList;
	}
	
	/**
	 * 查找第一个文档
	 * @param dbName    库名
	 * @param collName  集合名
	 * @return
	 */
	public static Document findFirst(String dbName, String collName) {
		return getColl(dbName, collName).find().first();
	}

	/**
	 * 以查询条件查找第一个文档
	 * @param dbName    库名
	 * @param collName  集合名
	 * @param query     查询条件
	 * @return
	 */
	public static Document findFirst(String dbName, String collName, Bson query) {
		return getColl(dbName, collName).find(query).first();
	}

	/**
	 * 以查询条件和排序条件查找第一个文档
	 * @param dbName    库名
	 * @param collName  集合名
	 * @param query     查询条件
	 * @param sort      排序条件
	 * @return
	 */
	public static Document findFirst(String dbName, String collName, Bson query, Bson sort) {
		return getColl(dbName, collName).find(query).sort(sort).first();   //sort如new BasicDBObject("创建时间", -1)
	}
	
	/**
	 * 查询全部符合条件的一个文档
	 * @param coll 集合
	 * @param d    文档
	 * @param keys 查询条件的key
	 * @return
	 */
	public static Document findone(MongoCollection<Document> coll, Document d, String[] keys){
		BasicDBObject condition = new BasicDBObject();
		for (String key : keys) {
			condition.append(key, d.get(key).toString());
		}
		FindIterable<Document> findIter = coll.find(condition).noCursorTimeout(true);
		return findIter.first();
	}
	
	/**
	 *  获取mongo服务
	 * @param ip      地址
	 * @param port    端口，默认27017
	 * @return
	 */
	public static MongoClient getClient(String ip, int port) {
		return new MongoClient(ip, port);  
	}
	
	/**
	 * 获取一个集合
	 * @param dbName    库名
	 * @param collName  集合名
	 * @return
	 */
	public static MongoCollection<Document> getColl(String dbName, String collName) {
		return client.getDatabase(dbName).getCollection(collName);  //getCollection：没有该表则创建
	}
	
	/**
	 * 初始化
	 * @param client 
	 */
	public static MongoClient init(MongoClient client) {
		MongoUtils.client = client;
		return client;
	}
	
	/**
	 * 插入一个文档
	 * @param coll
	 * @param d
	 * @return
	 */
	public static boolean insertOne(MongoCollection<Document> coll, Document d) {
		if (d != null) {
			coll.insertOne(d);
			return true;
		}
		return false;
	}
	
	/**
	 * 插入多个文档
	 * @param coll
	 * @param d
	 * @return
	 */
	public static boolean insertMany(MongoCollection<Document> coll, List<Document> list) {
		if (!list.isEmpty()) {
			coll.insertMany(list);
			return true;
		}
		return false;
	}
	
	/**
	 * 输出所有库名
	 * @param dbName    库名
	 */
	public static void printAllDatabaseNames(){
		MongoIterable<String> dbNames = client.listDatabaseNames();
		for(String s : dbNames){
			System.out.println(s);
		}
	}
	
	/**
	 * 删除文档指定字段keys
	 * @param coll  集合
	 * @param d     文档
	 * @param keys  指定key
	 * @return
	 */
	public static Document removeKeys(MongoCollection<Document> coll, Document d, String[] keys){
		for(String k : keys){
			d.remove(k);
		}
		return d;
	}
	
	/**
	 * 修改一条指定字段的值，有则更新，否则插入
	 * @param coll 
	 * @param key  筛选字段
	 * @param querVal 筛选字段值
	 * @param condition 修改命令如$set
	 * @param d  目标文档
	 * @return
	 */
	public static boolean updateOne(MongoCollection<Document> coll, String key, String querVal, String condition, Document d){
		coll.updateOne(Filters.eq(key, querVal), new Document(condition, d));  
//		coll.updateOne(Filters.eq(key,querVal), Updates.set("修改字段", 值 ));
		return false;
	}
	

	/**
	 * 修改多条指定字段的值，有则更新，否则插入
	 * @param coll 
	 * @param key  筛选字段
	 * @param querVal 筛选字段值
	 * @param condition 修改命令如$set
	 * @param d  目标文档
	 * @return
	 */
	public static boolean updateMany(MongoCollection<Document> coll, String key, String querVal, String condition, Document d){
		coll.updateMany(Filters.eq(key, querVal), new Document(condition, d));  //condition如为$set
		return false;
	}
	
	/**
	 * 删除文档的字段
	 * @param coll
	 * @param key
	 * @param condition 删除一条或多条
	 * @param d   包含删除字段的文档，形式如new Document(key, 0)
	 */
	public static void removeKey(MongoCollection<Document> coll, String condition, Document d){
		if (condition.trim().equals("one")) {
			coll.updateOne(Filters.eq("_id", d.get("_id")), new Document("$unset", d));
		}else{
			coll.updateMany(Filters.eq("_id", d.get("_id")), new Document("$unset", d));
		}
	}
	
	/**
	 * 修改文档的字段名
	 * @param coll
	 * @param key
	 * @param condition 修改一条或多条
	 * @param d   包含修改字段的文档，形式如new Document(旧key, 新key)
	 */
	public static void renameKey(MongoCollection<Document> coll, String condition, Document d){
		if (condition.trim().equals("one")) {
			coll.updateOne(Filters.eq("_id", d.get("_id")), new Document("$rename", d));
		}else{
			coll.updateMany(Filters.eq("_id", d.get("_id")), new Document("$rename", d));
		}
	}
	
	

}
