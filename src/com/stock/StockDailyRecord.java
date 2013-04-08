package com.stock;

import java.sql.Timestamp;
import java.util.Date;

public class StockDailyRecord implements java.io.Serializable {

	private Integer recordId;
	private Stock stock;
	private Float priceOpen;
	private Float priceClose;
	private Float priceChange;
	private Integer volume;
	private Timestamp date;

	public StockDailyRecord() {
	}

	public StockDailyRecord(Stock stock, Timestamp date) {
		this.stock = stock;
		this.date = date;
	}

	public StockDailyRecord(Stock stock, Float priceOpen, Float priceClose,
			Float priceChange, Integer volume, Timestamp date) {
		this.stock = stock;
		this.priceOpen = priceOpen;
		this.priceClose = priceClose;
		this.priceChange = priceChange;
		this.volume = volume;
		this.date = date;
	}

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Float getPriceOpen() {
		return this.priceOpen;
	}

	public void setPriceOpen(Float priceOpen) {
		this.priceOpen = priceOpen;
	}

	public Float getPriceClose() {
		return this.priceClose;
	}

	public void setPriceClose(Float priceClose) {
		this.priceClose = priceClose;
	}

	public Float getPriceChange() {
		return this.priceChange;
	}

	public void setPriceChange(Float priceChange) {
		this.priceChange = priceChange;
	}

	
	



	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	
}
