package com.mallon.RestBoot.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketData {

    @JsonProperty("BUY_LIMIT")
    private int buyLimit;

    @JsonProperty("SELL_LIMIT")
    private int sellLimit;

    @JsonProperty("TICKER")
    private String ticker;

    @JsonProperty("MAX_PRICE_SHIFT")
    private float maxPriceShift;

    @JsonProperty("BID_PRICE")
    private float bidPrice;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public float getMaxPriceShift() {
        return maxPriceShift;
    }

    public void setMaxPriceShift(float maxPriceShift) {
        this.maxPriceShift = maxPriceShift;
    }

    public float getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(float bidPrice) {
        this.bidPrice = bidPrice;
    }

    public float getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(float askPrice) {
        this.askPrice = askPrice;
    }

    public float getLastTradedPrice() {
        return lastTradedPrice;
    }

    public void setLastTradedPrice(float lastTradedPrice) {
        this.lastTradedPrice = lastTradedPrice;
    }

    @JsonProperty("ASK_PRICE")
    private float askPrice;

    @JsonProperty("LAST_TRADED_PRICE")
    private float lastTradedPrice;

    public int getBuyLimit() {
        return buyLimit;
    }

    public void setBuyLimit(int buyLimit) {
        this.buyLimit = buyLimit;
    }

    public int getSellLimit() {
        return sellLimit;
    }

    public void setSellLimit(int sellLimit) {
        this.sellLimit = sellLimit;
    }
}
