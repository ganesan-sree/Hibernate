package com;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;

import com.stock.Stock;
import com.stock.StockDailyRecord;
import com.util.HibernateUtil;


public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to many (XML Mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Stock stockUpdate=(Stock) session.get(Stock.class, 49);
		stockUpdate.setStockName("Ganesan1");
		Stock stock = new Stock();
        stock.setStockCode("7051");
        stock.setStockName("PADINI");
        
        session.saveOrUpdate(stock);
        
        StockDailyRecord stockDailyRecordsUpdate=(StockDailyRecord) session.get(StockDailyRecord.class, 49);
System.out.println(stockDailyRecordsUpdate);
        
        StockDailyRecord stockDailyRecords = new StockDailyRecord();
        stockDailyRecords.setPriceOpen(new Float("1.3"));
        stockDailyRecords.setPriceClose(new Float("1.4"));
        stockDailyRecords.setPriceChange(new Float("10.5"));
        stockDailyRecords.setVolume(300);
        stockDailyRecords.setDate(new Timestamp(new Date().getTime()) );
        
        
        stockDailyRecords.setStock(stockUpdate);        
       // stock.getStockDailyRecords().add(stockDailyRecords);

        session.saveOrUpdate(stockDailyRecords);

		session.getTransaction().commit();
		System.out.println("Done");
	}
}
