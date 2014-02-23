/*
 * Copyright (c) 2007 9095-2458 Quebec Inc. All Rights Reserved.
 *
 * Althought this code is consider of good quality and has been tested, it is
 * provided to you WITHOUT guaranty of any kind.
 */
package com.quartz.qtrend.dom.services.readers;

import com.quartz.qtrend.dom.StockQuote;
import com.quartz.qtrend.dom.helpers.Ticker;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * INSERT YOUR COMMENT HERE....
 *
 * @author Christian
 * @since Quartz...
 */
public class ExchangeReader implements IFieldReader
{
    ///////////////////////////////////////
    ////    STATIC ATTRIBUTES

    ///////////////////////////////////////
    ////    STATIC METHODS

    ///////////////////////////////////////
    ////    INSTANCE ATTRIBUTES

    ///////////////////////////////////////
    ////    CONSTRUCTORS

    public ExchangeReader()
    {
    }

    ///////////////////////////////////////
    ////    INSTANCE METHODS

    public void read(ResultSet pResultSet, StockQuote pQuote) throws SQLException
    {
        pQuote.setStockExchange(new Ticker(pResultSet.getString("STOCKEXCHANGE").trim()));
    }
    ///////////////////////////////////////
    ////    INNER CLASSES
}