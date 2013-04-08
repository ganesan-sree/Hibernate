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
		
		Stock stock = new Stock();
		stock.setStockId(2);
        stock.setStockCode("7052");
        stock.setStockName("PADINI");
        session.save(stock);
        
        StockDailyRecord stockDailyRecords = new StockDailyRecord();
        stockDailyRecords.setPriceOpen(new Float("1.2"));
        stockDailyRecords.setPriceClose(new Float("1.1"));
        stockDailyRecords.setPriceChange(new Float("10.0"));
        stockDailyRecords.setVolume(300);
        stockDailyRecords.setDate(new Timestamp(new Date().getTime()) );
        stockDailyRecords.setRecordId(1);
        
        stockDailyRecords.setStock(stock);        
        stock.getStockDailyRecords().add(stockDailyRecords);

        session.save(stockDailyRecords);

		session.getTransaction().commit();
		System.out.println("Done");
	}
}
